package com.tollcafe.networkrequestpractice

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {
    private const val BASE_URL="https://www.wanandroid.com/"

    private val loggingInterceptor=HttpLoggingInterceptor().apply {
        level=HttpLoggingInterceptor.Level.BODY
    }

    private val okHttpClient= OkHttpClient.Builder()
        .addInterceptor(loggingInterceptor)
        .build()

    private val retrofit= Retrofit.Builder()
        .baseUrl(BASE_URL)
        .client(okHttpClient)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val apiService=retrofit.create(ApiService::class.java)
}