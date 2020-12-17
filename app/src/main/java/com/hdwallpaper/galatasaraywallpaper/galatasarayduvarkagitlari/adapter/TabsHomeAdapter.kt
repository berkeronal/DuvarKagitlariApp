package com.hdwallpaper.galatasaraywallpaper.galatasarayduvarkagitlari.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.hdwallpaper.galatasaraywallpaper.galatasarayduvarkagitlari.model.FragmentModel
import com.hdwallpaper.galatasaraywallpaper.galatasarayduvarkagitlari.ui.CategoriesFragment

/* class TabsHomeAdapter(fragmentManager: FragmentManager,private val homeElementsFragmentList : List<Fragment>) : FragmentStatePagerAdapter(fragmentManager,BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT
){
    override fun getCount(): Int {
        return homeElementsFragmentList.size
    }

    override fun getItem(position: Int): Fragment {
        return homeElementsFragmentList[position]
    }

}
*/
class TabsHomeAdapter(fa: FragmentActivity, private val homeElementsFragmentList: List<FragmentModel>) : FragmentStateAdapter(fa) {


    override fun getItemCount(): Int {
        return homeElementsFragmentList.size
    }

    fun getPageTitle(index: Int): String {
        return homeElementsFragmentList[index].fragmentTitle
    }

    override fun createFragment(position: Int): Fragment {
        return CategoriesFragment()
    }
}