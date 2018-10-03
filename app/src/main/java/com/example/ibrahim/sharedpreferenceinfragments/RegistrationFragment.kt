package com.example.ibrahim.sharedpreferenceinfragments

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.register_fragment.*
import kotlinx.android.synthetic.main.register_fragment.view.*

class RegistrationFragment :Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val fragManager= activity!!.supportFragmentManager
        val  view=inflater.inflate(R.layout.register_fragment, container, false)


        view.regisdBtn.setOnClickListener {
            val sharedPref=activity!!.getSharedPreferences("mySharedPref",Context.MODE_PRIVATE)
            val spEditor=sharedPref.edit()
            spEditor.putString("uname",unameReg.text.toString())
            spEditor.putString("uemail",emailReg.text.toString())
            spEditor.putString("uphone",phoneReg.text.toString())
            spEditor.putString("upass",passReg.text.toString())
            spEditor.apply()
            fragManager.beginTransaction().replace(R.id.frameMainAct,LoginFragment()).commit()

        }
        return view
    }
}