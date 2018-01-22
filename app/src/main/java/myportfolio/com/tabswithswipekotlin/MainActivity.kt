package myportfolio.com.tabswithswipekotlin

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import myportfolio.com.tabswithswipekotlin.recyclerview.RecyclerActivity
import myportfolio.com.tabswithswipekotlin.retrofit.RetrofitActivity
import myportfolio.com.tabswithswipekotlin.swipetabs.SwipeTabsActivity

class MainActivity : AppCompatActivity() {

//    var toolbar: Toolbar? = null
//    var btSwipeTabs: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        toolbar = findViewById(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)

        /*val btnSwipeTab = findViewById<Button>(R.id.btn_swipe_tabs)
        val btnSwipeTabs = findViewById(R.id.btn_swipe_tabs) as Button*/

        btn_swipe_tabs.setOnClickListener {
            startActivity(Intent(this, SwipeTabsActivity::class.java))
        }
        btn_recycler_view.setOnClickListener {
            startActivity(Intent(this, RecyclerActivity::class.java))
        }
        btn_retrofit_api_call.setOnClickListener {
            startActivity(Intent(this, RetrofitActivity::class.java))
        }
    }

}
