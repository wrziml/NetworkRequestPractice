package com.tollcafe.networkrequestpractice

import retrofit2.http.GET

interface ApiService {
    @GET("hotkey/json")
    suspend fun getHotkeys(): HotKeyResponse
}