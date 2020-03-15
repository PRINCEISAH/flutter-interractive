package com.example.flutterinterractive

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        sign_in_btn.setOnClickListener {

            var intient_Sign_up = Intent(this,SIGN_IN_Activity::class.java)
            startActivity(intient_Sign_up)


        }

    }
}
