package com.example.clutch.ui.armas

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.clutch.R
import com.example.clutch.databinding.FragmentJugadorBinding


class armas : Fragment() {

    private var _binding: FragmentJugadorBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_armas, container, false)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}