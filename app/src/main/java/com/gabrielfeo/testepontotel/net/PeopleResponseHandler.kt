package com.gabrielfeo.testepontotel.net

import com.gabrielfeo.testepontotel.model.Person
import com.gabrielfeo.testepontotel.net.response.PeopleResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class PeopleResponseHandler(val onSuccess: (people: List<Person>) -> Unit)
    : Callback<PeopleResponse> {

    override fun onResponse(call: Call<PeopleResponse>, response: Response<PeopleResponse>) {
        if (response.isSuccessful) response.body()?.let { onSuccess(it.peopleList) }
    }

    override fun onFailure(call: Call<PeopleResponse>, t: Throwable) = t.printStackTrace()

}