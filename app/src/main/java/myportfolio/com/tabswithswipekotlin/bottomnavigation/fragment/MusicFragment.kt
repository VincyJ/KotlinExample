package myportfolio.com.tabswithswipekotlin.bottomnavigation.fragment


import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import myportfolio.com.tabswithswipekotlin.R


/**
 * A simple [Fragment] subclass.
 */
class MusicFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater!!.inflate(R.layout.fragment_music, container, false)
    }

}// Required empty public constructor
