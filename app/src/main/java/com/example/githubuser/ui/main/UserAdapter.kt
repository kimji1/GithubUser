package com.example.githubuser.ui.main

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.githubuser.databinding.UserViewHolderBinding
import com.example.githubuser.vo.User

class UserAdapter : RecyclerView.Adapter<UserViewHolder>() {
    var users: List<User>? = null

    override fun getItemCount(): Int = users?.size ?: 0

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val binding =
            UserViewHolderBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return UserViewHolder(binding)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder.init(users!![position])
    }
}
