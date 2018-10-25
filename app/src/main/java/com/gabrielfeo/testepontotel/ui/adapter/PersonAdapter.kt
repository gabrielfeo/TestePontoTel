package com.gabrielfeo.testepontotel.ui.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.gabrielfeo.testepontotel.R
import com.gabrielfeo.testepontotel.model.Person
import com.gabrielfeo.testepontotel.ui.viewHolder.PersonViewHolder
import kotlin.properties.Delegates

class PersonAdapter : RecyclerView.Adapter<PersonViewHolder>() {

    val peopleList: List<Person>? by Delegates.observable(emptyList()) { _, _, _ -> notifyDataSetChanged() }

    override fun getItemCount(): Int = peopleList?.size ?: 0

    override fun onCreateViewHolder(parent: ViewGroup, position: Int): PersonViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.listitem_person, parent, false)
        return PersonViewHolder(view);
    }

    override fun onBindViewHolder(personViewHolder: PersonViewHolder, position: Int) {
        peopleList?.let {
            personViewHolder.idView.text = it[position].id
            personViewHolder.nameView.text = it[position].name
            personViewHolder.pwdView.text = it[position].pwd.toString()
        }
    }
}