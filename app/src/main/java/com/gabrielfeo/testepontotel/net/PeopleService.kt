package com.gabrielfeo.testepontotel.net

import com.gabrielfeo.testepontotel.net.response.PeopleResponse
import retrofit2.Call
import retrofit2.http.GET

interface PeopleService {

    @GET("data.json")
    fun getPeople(): Call<PeopleResponse>

}