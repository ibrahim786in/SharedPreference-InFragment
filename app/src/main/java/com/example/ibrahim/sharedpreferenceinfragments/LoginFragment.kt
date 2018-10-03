package com.example.ibrahim.sharedpreferenceinfragments

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.login_fragment.view.*

class LoginFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val fManager = activity!!.supportFragmentManager
        val view = inflater.inflate(R.layout.login_fragment, container, false)

        view.gotoregisdBtn.setOnClickListener {
            fManager.beginTransaction().replace(R.id.frameMainAct, RegistrationFragment()).commit()

        }
        view.loginBtn.setOnClickListener {
            val sharedPref = activity!!.getSharedPreferences("mySharedPref", Context.MODE_PRIVATE)
            val username = sharedPref.getString("uname", "No Username")
            val password = sharedPref.getString("upass", "No Password")
            if (username == view.unameLog.text.toString() && password == view.passLog.text.toString()) {
                Toast.makeText(activity, "Login Successfull", Toast.LENGTH_SHORT).show()
                fManager.beginTransaction().replace(R.id.frameMainAct, WelcomeFragment()).commit()
            }
            else Toast.makeText(activity, "Username or password incorrect", Toast.LENGTH_SHORT).show()
        }

        return view
    }
}