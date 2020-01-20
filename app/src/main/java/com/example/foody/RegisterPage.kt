package com.example.foody

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_register_page.*

class RegisterPage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_page)
    }

    fun registerHostAccount(v: View?) {
        val myIntent = Intent(baseContext, RegisterAsHost::class.java)
        startActivity(myIntent)
    }

    fun registerConsumerAccount(view: View) {
        val myIntent = Intent(baseContext, RegisterAsConsumer::class.java)
        startActivity(myIntent)
    }

    fun loginPage(v: View?) {
        val myIntent = Intent(baseContext, LoginPage::class.java)
        startActivity(myIntent)
    }

}
