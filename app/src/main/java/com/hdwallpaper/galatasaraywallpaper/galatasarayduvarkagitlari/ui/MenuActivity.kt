package com.hdwallpaper.galatasaraywallpaper.galatasarayduvarkagitlari.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.tabs.TabLayoutMediator
import com.hdwallpaper.galatasaraywallpaper.galatasarayduvarkagitlari.adapter.TabsHomeAdapter
import com.hdwallpaper.galatasaraywallpaper.galatasarayduvarkagitlari.databinding.ActivityMenuBinding
import com.hdwallpaper.galatasaraywallpaper.galatasarayduvarkagitlari.mock.MockData

class MenuActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMenuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenuBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        init()
    }

    private fun init() {

        var globalAdapter = TabsHomeAdapter(
                this,
                MockData.getHomeElementsFragment(2)
        )
        binding.vpHome.adapter = globalAdapter

        TabLayoutMediator(
                binding.tabLayHome,
                binding.vpHome
        )
        { tab,
          position ->
            tab.text = globalAdapter.getPageTitle(position)
        }.attach()
    }
}