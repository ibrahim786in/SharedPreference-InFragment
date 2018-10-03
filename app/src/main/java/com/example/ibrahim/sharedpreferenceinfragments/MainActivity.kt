package com.example.ibrahim.sharedpreferenceinfragments

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
          setContentView(R.layout.activity_main)
        val fragManager=supportFragmentManager
        fragManager.beginTransaction().add(R.id.frameMainAct,LoginFragment()).commit()


    }
}
