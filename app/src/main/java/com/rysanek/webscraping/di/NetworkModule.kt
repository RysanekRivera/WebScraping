package com.rysanek.webscraping.di

import com.rysanek.webscraping.data.remote.ScrapeApi
import com.rysanek.webscraping.other.Constants.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {
    
    /**Singleton instantiation of [ScrapeApi]**/
    @Provides
    @Singleton
    fun provideScrapeApi(): ScrapeApi =
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(ScalarsConverterFactory.create())
            .build()
            .create(ScrapeApi::class.java)
    
    
}