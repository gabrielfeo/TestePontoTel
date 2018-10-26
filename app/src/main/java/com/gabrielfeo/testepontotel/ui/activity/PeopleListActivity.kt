package com.gabrielfeo.testepontotel.ui.activity

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.gabrielfeo.testepontotel.R
import com.gabrielfeo.testepontotel.model.Person
import com.gabrielfeo.testepontotel.ui.adapter.PersonAdapter
import com.gabrielfeo.testepontotel.ui.viewModel.PeopleListViewModel

class PeopleListActivity : AppCompatActivity() {

    private val viewModel by lazy {
        ViewModelProviders.of(this)
                .get(PeopleListViewModel::class.java)
    }
    private val adapter = PersonAdapter()
    private val recyclerView: RecyclerView by lazy { findViewById<RecyclerView>(R.id.peoplelist_rv_list) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_people_list)
        setupRecyclerView()
        observePeople()
    }

    private fun setupRecyclerView() = recyclerView.apply {
        adapter = this@PeopleListActivity.adapter
        layoutManager = LinearLayoutManager(this@PeopleListActivity)
        setHasFixedSize(true)
    }

    private fun observePeople() = viewModel.people.observe(this, Observer<List<Person>> {
        adapter.peopleList = it
    })
}
