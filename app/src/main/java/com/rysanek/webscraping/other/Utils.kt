package com.rysanek.webscraping.other

import android.app.Activity
import android.os.Build
import android.view.WindowInsets
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.google.android.material.snackbar.Snackbar
import com.rysanek.webscraping.R

@RequiresApi(Build.VERSION_CODES.R)
fun AppCompatActivity.setUpSystemWindow(){
    val navBarColor = ContextCompat.getColor(this.applicationContext, R.color.navigation_bar_color)
    val statusBarColor = ContextCompat.getColor(this.applicationContext, R.color.status_bar_color)
    this.window.setDecorFitsSystemWindows(false)
    this.window.navigationBarColor = navBarColor
    this.window.statusBarColor = statusBarColor
}

fun Fragment.showSnackBar(message: String){
    Snackbar.make(requireView(), message, Snackbar.LENGTH_SHORT)
        .setAction("OK"){}
        .show()
}

@RequiresApi(Build.VERSION_CODES.R)
fun Activity.hideKeyboard(){
    window.insetsController?.hide(WindowInsets.Type.ime())
}