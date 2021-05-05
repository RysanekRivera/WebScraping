package com.rysanek.webscraping.ui.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.rysanek.webscraping.databinding.FragmentJsoupBinding
import com.rysanek.webscraping.other.Constants.BASE_URL
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.jsoup.Jsoup

class JSoupFragment: Fragment() {
    
    private lateinit var binding: FragmentJsoupBinding
    
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentJsoupBinding.inflate(layoutInflater)
        // Inflate the layout for this fragment
        
        /**Jsoup Web Scraping implementation**/
        GlobalScope.launch(Dispatchers.IO) {
            val htmlDoc = Jsoup.connect(BASE_URL).get()
            Log.d("Result", htmlDoc.toString())
            
            withContext(Dispatchers.Main) {
                val htmlText = htmlDoc.text()
                //update UI
                binding.tvJsoup.text = htmlText
            }
        }
        return binding.root
    }
    
}