package com.example.bankappprojectnav

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.navigation.fragment.findNavController


class LockFragment : Fragment() {

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view= inflater.inflate(R.layout.fragment_lock, container, false)
        val buttonOne = view.findViewById<ImageView>(R.id.home)
        buttonOne.setOnClickListener{
            findNavController().navigate(R.id.action_lockFragment_to_longFragment)

        }
        return view

    }


}