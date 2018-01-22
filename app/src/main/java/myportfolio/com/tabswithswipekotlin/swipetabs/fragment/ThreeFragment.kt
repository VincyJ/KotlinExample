package myportfolio.com.tabswithswipekotlin.swipetabs.fragment


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import myportfolio.com.tabswithswipekotlin.R


/**
 * A simple [Fragment] subclass.
 */
class ThreeFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater!!.inflate(R.layout.fragment_three, container, false)
    }

}
