package com.gabrielfeo.testepontotel.net

import com.gabrielfeo.testepontotel.net.RetrofitProvider.Companion.retrofit
import com.gabrielfeo.testepontotel.net.response.PeopleResponse
import retrofit2.Call

class PeopleRepository {

    private val jsonDataService by lazy { retrofit.create(PeopleService::class.java) }

    fun getPeople(): Call<PeopleResponse> = jsonDataService.getPeople()

}