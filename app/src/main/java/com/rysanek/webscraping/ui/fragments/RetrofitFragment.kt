package com.rysanek.webscraping.ui.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.rysanek.webscraping.data.remote.ScrapeApi
import com.rysanek.webscraping.databinding.FragmentRetrofitBinding
import dagger.hilt.android.AndroidEntryPoint
import org.jsoup.Jsoup
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

@AndroidEntryPoint
class RetrofitFragment: Fragment() {
    
    private lateinit var binding: FragmentRetrofitBinding
    @Inject lateinit var api: ScrapeApi
    
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentRetrofitBinding.inflate(layoutInflater)
        
        api.data().enqueue(callback())
        
        return binding.root
    }
    
    private fun callback() = object: Callback<String> {
        override fun onResponse(call: Call<String>, response: Response<String>) {
            Log.d("Response", response.toString())
            val parsedText = Jsoup.parse(response.body()).text()
            binding.tvRetrofit.text = parsedText
        }
        
        override fun onFailure(call: Call<String>, t: Throwable) {
            Log.d("Response", t.message.toString())
        }
    }
    
}