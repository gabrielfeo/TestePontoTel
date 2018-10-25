package com.gabrielfeo.testepontotel.net

import com.gabrielfeo.testepontotel.model.Person
import com.gabrielfeo.testepontotel.net.RetrofitProvider.Companion.retrofit
import com.gabrielfeo.testepontotel.net.response.PeopleResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class PeopleRepository {

    companion object {

        private val jsonDataService by lazy { retrofit.create(PeopleService::class.java) }

        val people: List<Person> by lazy {
            var people: List<Person>? = null
            jsonDataService.getPeople().enqueue(object : Callback<PeopleResponse> {
                override fun onResponse(call: Call<PeopleResponse>, response: Response<PeopleResponse>) {
                    if (response.isSuccessful) people = response.body()?.peopleList
                }

                override fun onFailure(call: Call<PeopleResponse>, t: Throwable) = t.printStackTrace()
            })
            people ?: emptyList()
        }

    }

}