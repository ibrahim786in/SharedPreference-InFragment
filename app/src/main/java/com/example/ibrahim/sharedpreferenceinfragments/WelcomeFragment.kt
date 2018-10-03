package com.example.ibrahim.sharedpreferenceinfragments

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.welcome_fragment.view.*

class WelcomeFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.welcome_fragment, container, false)
        val sharedPref = activity!!.getSharedPreferences("mySharedPref", Context.MODE_PRIVATE)
        val username = sharedPref.getString("uname", "No Username")

        view.tv1.text = username

        return view
    }
}