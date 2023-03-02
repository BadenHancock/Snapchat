package com.example.snapchat


import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.snapchat.databinding.ListItemLayoutBinding

class SnapViewHolder (val binding: ListItemLayoutBinding) :
    RecyclerView.ViewHolder(binding.root) {

    lateinit var globalSnap : Snap
    init {
        binding.root.setOnClickListener { view ->
            globalSnap.isOpened = true
            setSnapStatus(globalSnap)
            val action = MainFragmentDirections.actionMainFragmentToImageFragment()
            view.findNavController().navigate(action)
        }
    }

    fun bindSnap(snap: Snap) {
        globalSnap = snap
        binding.textViewName.text = globalSnap.username
        binding.timeSent.text = globalSnap.timeSent
        binding.imageViewSnapImage.setImageResource(globalSnap.SnapImageResource)
        setSnapStatus(globalSnap)
    }
    fun setSnapStatus(opened : Snap) {
        binding.opened.text = globalSnap.stringOpened
        binding.imageView.setImageResource(globalSnap.ImageResourceOpened)
    }
}