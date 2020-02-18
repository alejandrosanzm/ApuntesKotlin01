package com.example.apunteskotlin01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_user_view.*

class userView : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_view)

        val bundle = intent.extras
        val name = bundle?.get("user")
        val pass = bundle?.get("password")

        txtName2.text = "Name: " + name
        txtPassword2.text = "Password: " + pass
    }
}
