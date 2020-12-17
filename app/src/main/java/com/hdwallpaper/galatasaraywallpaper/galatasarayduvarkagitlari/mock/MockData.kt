package com.hdwallpaper.galatasaraywallpaper.galatasarayduvarkagitlari.mock

import com.hdwallpaper.galatasaraywallpaper.galatasarayduvarkagitlari.model.FragmentModel
import com.hdwallpaper.galatasaraywallpaper.galatasarayduvarkagitlari.ui.CategoriesFragment

//
// 
//
//    .___________________________.
//    | ._____________________. |=|
//    | | ................... | | |
//    | | Berker ÖNAL         | | |
//    | | 17.12.2020 - 08:34  | | |
//    | | berker435@gmail.com | | |
//    | | ................... | | |
//    | ! ____________________! | |
//    !________________________!_!
//  /  [][][][][][][][][][][][][]  \
// /  [][][][][][][][][][][][][][]  \
//(  [][][][][____________][][][][]  )
// \ ------------------------------ /
//  \______________________________/

object MockData {
    fun getHomeElementsFragment(fragmentSize: Int): List<FragmentModel> {
        val fragmentList = ArrayList<FragmentModel>()
        for (item in 0..fragmentSize) {
            val categoriesFragment = CategoriesFragment()
            val fragmentModel = FragmentModel(getFragmentTitle(item), categoriesFragment)
            fragmentList.add(fragmentModel)
        }
        return fragmentList
    }

    private fun getFragmentTitle(position: Int): String {
        return when (position) {
            0 -> "Tab 1"
            1 -> "Tab 2"
            2 -> "Tab 3"
            else -> "Err"
        }
    }
}