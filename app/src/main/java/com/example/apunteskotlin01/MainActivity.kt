package com.example.apunteskotlin01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v?.id == button.id) {
            change()
        }
    }

    fun change() {
        val myIntent = Intent(this, userView::class.java)
        myIntent.putExtra("user", txtName.text.toString())
        myIntent.putExtra("password", txtPassword.text.toString())
        startActivity(myIntent)
        // finish()
    }
}
