package com.rysanek.webscraping.data.remote

import retrofit2.Call
import retrofit2.http.GET

interface ScrapeApi {
    
    @GET("/")
    fun data(): Call<String>
    
}