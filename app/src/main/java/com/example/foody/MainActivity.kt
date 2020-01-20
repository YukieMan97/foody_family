package com.example.foody

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun registerPage(v: View?) {
        val myIntent = Intent(baseContext, RegisterPage::class.java)
        startActivity(myIntent)
    }

    fun loginPage(v: View?) {
        val myIntent = Intent(baseContext, LoginPage::class.java)
        startActivity(myIntent)
    }
}
