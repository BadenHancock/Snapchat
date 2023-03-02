package com.example.snapchat

import Snap
import android.widget.Toast
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewdemo.MainFragmentDirections
import com.example.snapchat.databinding.FragmentMainBinding
import com.example.snapchat.databinding.ListItemLayoutBinding

class SnapViewHolder (val binding: ListItemLayoutBinding) :
    RecyclerView.ViewHolder(binding.root) {

    lateinit var globalSnap : Snap
    init {
        binding.root.setOnClickListener { view ->
            setSnapStatus(true)
            val action = MainFragmentDirections.actionMainFragmentToImageFragment()
            binding.root.findNavController().navigate(action)
        }
    }

    fun bindSnap(snap: Snap) {
        globalSnap = snap
        binding.textViewName.text = globalSnap.username
        binding.timeSent.text = globalSnap.timeSent
        binding.imageViewSnapImage.setImageResource(globalSnap.SnapImageResource)
        setSnapStatus(false)
    }
    fun setSnapStatus(opened : Boolean) {
        globalSnap.isOpened = opened
        binding.opened.text = globalSnap.stringOpened
        binding.imageView.setImageResource(globalSnap.ImageResourceOpened)
    }
}