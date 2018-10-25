package com.gabrielfeo.testepontotel.ui.viewModel

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import com.gabrielfeo.testepontotel.model.Person
import com.gabrielfeo.testepontotel.net.PeopleRepository

class PeopleListViewModel : ViewModel() {

    private val _people: MutableLiveData<List<Person>> = MutableLiveData()
    val people: LiveData<List<Person>>
        get() = _people.also { it.value ?: refreshPeople() }

    private fun refreshPeople() = _people.setValue(PeopleRepository.people)

}