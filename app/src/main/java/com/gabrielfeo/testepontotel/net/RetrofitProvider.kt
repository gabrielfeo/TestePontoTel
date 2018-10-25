package com.gabrielfeo.testepontotel.net

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

private const val DATA_BASE_URL = "https://s3-sa-east-1.amazonaws.com/pontotel-docs/"

class RetrofitProvider private constructor() {

    companion object {

        val retrofit: Retrofit by lazy { getNewRetrofitInstance() }

        private fun getNewRetrofitInstance(): Retrofit {
            return Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(DATA_BASE_URL)
                .build()
        }

    }

}