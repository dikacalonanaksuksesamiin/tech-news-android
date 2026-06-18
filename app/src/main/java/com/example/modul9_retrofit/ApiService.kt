package com.example.modul9_retrofit

import retrofit2.Call
import retrofit2.http.GET

interface ApiService {

    @GET("terbaru/")
    fun getNews(): Call<NewsResponse>

}