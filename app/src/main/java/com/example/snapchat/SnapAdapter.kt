package com.example.snapchat

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.snapchat.databinding.ListItemLayoutBinding

class SnapAdapter(val SnapList: List<Snap>) : RecyclerView.Adapter<SnapViewHolder>() {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SnapViewHolder {
                val binding = ListItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
                return SnapViewHolder(binding)
        }


        override fun onBindViewHolder(holder: SnapViewHolder, position: Int) {
                val currentCourse = SnapList[position]
                holder.bindSnap(currentCourse)
        }

        override fun getItemCount(): Int {
                return SnapList.size
        }
}