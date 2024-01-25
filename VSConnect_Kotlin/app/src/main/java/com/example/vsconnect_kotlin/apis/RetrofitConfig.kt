package com.example.vsconnect_kotlin.apis

class RetrofitConfig {
    companion object{
        fun obterInstanciaRetrofit(url: String = "http://172.16.52.84:8099/") : Retrofit{
            return Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
    }
}