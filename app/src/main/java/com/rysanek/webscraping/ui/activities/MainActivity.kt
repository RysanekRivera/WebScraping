package com.rysanek.webscraping.ui.activities

import android.os.Build
import android.os.Bundle
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import com.rysanek.webscraping.R
import com.rysanek.webscraping.other.setUpSystemWindow
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
@RequiresApi(Build.VERSION_CODES.R)
class MainActivity: AppCompatActivity() {
    
    override fun onCreate(savedInstanceState: Bundle?) {
        setUpSystemWindow()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    
    
//    private fun hideSystemWindow(){
//        window.decorView.fitsSystemWindows = false
////        window.statusBarColor = ContextCompat.getColor(this, R.color.purple_200)
//        window.navigationBarColor = ContextCompat.getColor(this, R.color.transparent)
////        window.insetsController!!.hide(WindowInsets.Type.navigationBars())
//        supportActionBar?.hide()
//        actionBar?.hide()
//    }
}

