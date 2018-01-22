package myportfolio.com.tabswithswipekotlin.swipetabs

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.MenuItem
import myportfolio.com.tabswithswipekotlin.*
import myportfolio.com.tabswithswipekotlin.swipetabs.adapter.ViewPagerAdapter
import myportfolio.com.tabswithswipekotlin.swipetabs.fragment.OneFragment
import myportfolio.com.tabswithswipekotlin.swipetabs.fragment.ThreeFragment
import myportfolio.com.tabswithswipekotlin.swipetabs.fragment.TwoFragment

class SwipeTabsActivity : AppCompatActivity() {

    var toolbar: Toolbar? = null
    var tabLayout: TabLayout? = null
    var viewPager: ViewPager? = null
    var mAdapter: ViewPagerAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_swipe_tabs)

        toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        viewPager = findViewById<ViewPager>(R.id.viewpager)
        setUpViewPager(viewPager as ViewPager)

        tabLayout = findViewById<TabLayout>(R.id.tabs)
        (tabLayout as TabLayout).setupWithViewPager(viewPager)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        var itemId = item!!.itemId
        when (itemId) {
            android.R.id.home -> startActivity(Intent(this, MainActivity::class.java))
        }
        return super.onOptionsItemSelected(item)
    }

    private fun setUpViewPager(ViewPager: ViewPager) {

        mAdapter = ViewPagerAdapter(getSupportFragmentManager())
        (mAdapter as ViewPagerAdapter).addFragment(OneFragment(), "ONE")
        (mAdapter as ViewPagerAdapter).addFragment(TwoFragment(), "TWO")
        (mAdapter as ViewPagerAdapter).addFragment(ThreeFragment(), "THREE")

        (viewPager as ViewPager).adapter = mAdapter
        mAdapter?.notifyDataSetChanged()
    }
}
