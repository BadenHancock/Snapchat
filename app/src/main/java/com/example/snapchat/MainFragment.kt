package com.example.snapchat


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.snapchat.databinding.FragmentMainBinding


class MainFragment : Fragment() {
    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!
    val SnapList = listOf(
        Snap("Christan Horner", "10m", R.drawable.christianhorner),
        Snap("Toto Wolff", "25m", R.drawable.christianhorner)
    )
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMainBinding.inflate(inflater, container, false)
        val rootView = binding.root
        // Inflate the layout for this fragment

        val myAdapter = SnapAdapter(SnapList)
        binding.recyclerView.adapter = myAdapter

        return rootView
    }
}