package com.gabrielfeo.testepontotel.net

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import com.gabrielfeo.testepontotel.model.Person
import com.gabrielfeo.testepontotel.net.RetrofitProvider.Companion.retrofit

class PeopleRepository {

    companion object {

        private val jsonDataService by lazy { retrofit.create(PeopleService::class.java) }

        private var _people: MutableLiveData<List<Person>> = MutableLiveData()
        val people: LiveData<List<Person>>
            get() {
                jsonDataService.getPeople().enqueue(PeopleResponseHandler { _people.value = it })
                return _people
            }

    }

}