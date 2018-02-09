package myportfolio.com.tabswithswipekotlin.bottomnavigation

import android.app.FragmentManager
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_bottom_navigation.*
import myportfolio.com.tabswithswipekotlin.R
import myportfolio.com.tabswithswipekotlin.bottomnavigation.fragment.*

class BottomNavigationActivity : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_navigation)

        bottom_navigation.setOnNavigationItemSelectedListener(this)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {

        var fragmentManager: FragmentManager = fragmentManager
        when (item.itemId) {
            R.id.home -> fragmentManager.beginTransaction().replace(R.id.main_container, HomeFragment()).commit()
            R.id.favorites -> fragmentManager.beginTransaction().replace(R.id.main_container, FavoritesFragment()).commit()
            R.id.schedules -> fragmentManager.beginTransaction().replace(R.id.main_container, ScheduleFragment()).commit()
            R.id.map -> fragmentManager.beginTransaction().replace(R.id.main_container, MapFragment()).commit()
            R.id.music -> fragmentManager.beginTransaction().replace(R.id.main_container, MusicFragment()).commit()
            else -> fragmentManager.beginTransaction().replace(R.id.main_container, HomeFragment()).commit()
        }
        return true
    }
}
