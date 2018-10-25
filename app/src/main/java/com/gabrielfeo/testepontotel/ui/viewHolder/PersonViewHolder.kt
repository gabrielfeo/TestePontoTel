package com.gabrielfeo.testepontotel.ui.viewHolder

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView
import com.gabrielfeo.testepontotel.R

class PersonViewHolder(personView: View) : RecyclerView.ViewHolder(personView) {

    val idView: TextView = itemView.findViewById(R.id.listitem_person_tv_id)
    val nameView: TextView = itemView.findViewById(R.id.listitem_person_tv_name)
    val pwdView: TextView = itemView.findViewById(R.id.listitem_person_tv_pwd)

}