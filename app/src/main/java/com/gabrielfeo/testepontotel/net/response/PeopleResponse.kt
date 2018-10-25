package com.gabrielfeo.testepontotel.net.response

import com.gabrielfeo.testepontotel.model.Person
import com.google.gson.annotations.SerializedName

data class PeopleResponse(
    @SerializedName("data") val peopleList: List<Person>
)