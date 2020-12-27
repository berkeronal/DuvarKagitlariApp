package com.hdwallpaper.galatasaraywallpaper.galatasarayduvarkagitlari.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.hdwallpaper.galatasaraywallpaper.galatasarayduvarkagitlari.R
import com.hdwallpaper.galatasaraywallpaper.galatasarayduvarkagitlari.databinding.FragmentCategoriesBinding

class CategoriesFragment : Fragment(R.layout.fragment_categories) {


    private var fragmentFirstBinding: FragmentCategoriesBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = FragmentCategoriesBinding.bind(view)
        fragmentFirstBinding = binding
        binding.recyclerView.adapter
    }

    override fun onDestroyView() {
        // Consider not storing the binding instance in a field
        // if not needed.
        fragmentFirstBinding = null
        super.onDestroyView()
    }

}