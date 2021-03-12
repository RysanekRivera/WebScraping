package com.rysanek.webscraping.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.rysanek.webscraping.R
import com.rysanek.webscraping.databinding.FragmentHomeBinding

class HomeFragment: Fragment() {
    private lateinit var binding: FragmentHomeBinding
    
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(layoutInflater)
        // Inflate the layout for this fragment
        
        binding.apply {
            cvRetrofit.setOnClickListener {
                findNavController().navigate(R.id.homeFragment_to_retrofitFragment)
            }
            
            cvJsoup.setOnClickListener {
                findNavController().navigate(R.id.homeFragment_to_jSoupFragment)
            }
        }
        
        return binding.root
    }
}