package com.example.clutch.ui.wallpapers

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.clutch.R
import com.example.clutch.activitywallpaper
import com.example.clutch.databinding.FragmentFragmentwallpaperBinding


class fragmentwallpaper : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val  bind = FragmentFragmentwallpaperBinding.inflate(layoutInflater)

        bind.btnwallpapers.setOnClickListener{
            val  intent = Intent (this@fragmentwallpaper.requireContext(), activitywallpaper::class.java)
            startActivity(intent)
        }

        // Inflate the layout for this fragment
        return bind.root
    }

}