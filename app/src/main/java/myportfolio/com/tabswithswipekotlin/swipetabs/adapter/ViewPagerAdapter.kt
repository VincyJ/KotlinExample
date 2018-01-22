package myportfolio.com.tabswithswipekotlin.swipetabs.adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

/**
 * Created by arputha_v on 1/9/2018.
 */
class ViewPagerAdapter(manager: FragmentManager) : FragmentPagerAdapter(manager) {
    var mFragmentList: List<Fragment> = ArrayList<Fragment>()
    var mFragmentTitleList: List<String> = ArrayList<String>()

    override fun getItem(position: Int): Fragment {
        return mFragmentList.get(position)
    }

    override fun getCount(): Int {
        return mFragmentList.size
    }

    fun addFragment(fragment: Fragment, title: String) {

        (mFragmentList as ArrayList<Fragment>).add(fragment)
        (mFragmentTitleList as ArrayList<String>).add(title)
    }

    override fun getPageTitle(position: Int): CharSequence {
        return mFragmentTitleList.get(position)
    }
}