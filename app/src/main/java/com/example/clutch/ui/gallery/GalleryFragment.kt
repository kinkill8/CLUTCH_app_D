package com.example.clutch.ui.gallery

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.clutch.databinding.FragmentAgentesBinding
import com.example.clutch.ui.infoagentes.infojett
import com.example.clutch.ui.infoagentes.infophoenix


class GalleryFragment : Fragment() {

    private var _binding: FragmentAgentesBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View{

        _binding = FragmentAgentesBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val bind = FragmentAgentesBinding.inflate(layoutInflater)
        bind.botonjett.setOnClickListener{
            val intent = Intent (this@GalleryFragment.requireContext(), infojett::class.java)
            startActivity(intent)
        }
        bind.botonphoenix.setOnClickListener{
            val intent = Intent (this@GalleryFragment.requireContext(), infophoenix::class.java)
            startActivity(intent)
        }
        return  bind.root

        //return root

    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
