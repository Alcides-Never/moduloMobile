package com.example.vsconnect_kotlin.apis

class RetrofitConfig {
    companion object{
        fun obterInstanciaRetrofit(url: String = "") : Retrofit{
            return Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
    }
}