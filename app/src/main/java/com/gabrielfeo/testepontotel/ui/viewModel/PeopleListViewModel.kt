package com.gabrielfeo.testepontotel.ui.viewModel

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.ViewModel
import com.gabrielfeo.testepontotel.model.Person
import com.gabrielfeo.testepontotel.net.PeopleRepository

class PeopleListViewModel : ViewModel() {

    val people: LiveData<List<Person>> = PeopleRepository.people

}