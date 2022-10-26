package com.example.clutch.ui.home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.clutch.comentarios
import com.example.clutch.databinding.FragmentAgentesBinding
import com.example.clutch.databinding.FragmentJugadorBinding
import com.example.clutch.ui.infoagentes.infojett


class HomeFragment : Fragment() {

    private var _binding: FragmentJugadorBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentJugadorBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val bind = FragmentJugadorBinding.inflate(layoutInflater)
        bind.btncomentarios.setOnClickListener{
            val intent = Intent (this@HomeFragment.requireContext(), comentarios::class.java)
            startActivity(intent)
        }


        return bind.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}