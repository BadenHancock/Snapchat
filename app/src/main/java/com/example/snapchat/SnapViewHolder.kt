package com.example.snapchat

import Snap
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.snapchat.databinding.FragmentMainBinding
import com.example.snapchat.databinding.ListItemLayoutBinding

class SnapViewHolder (val binding: ListItemLayoutBinding) :
    RecyclerView.ViewHolder(binding.root) {

    lateinit var globalSnap : Snap
    init {
        binding.root.setOnClickListener { view ->
            setSnapStatus()
        }
    }

    fun bindSnap(snap: Snap) {
        globalSnap = snap
        binding.textViewName.text = globalSnap.username
        binding.timeSent.text = globalSnap.timeSent
        binding.imageViewSnapImage.setImageResource(globalSnap.SnapImageResource)
        binding.opened.text = globalSnap.stringOpened
        binding.imageView.setImageResource(globalSnap.ImageResourceOpened)
    }
    fun setSnapStatus() {
        globalSnap.opened = true

    }
}