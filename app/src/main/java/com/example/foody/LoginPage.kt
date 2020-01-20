package com.example.foody

import android.app.ProgressDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login_page.*

class LoginPage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

//        var email: EditText? = null
//        var password: EditText? = null
//        var login: Button? = null

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_page)

//        email = findViewById(R.id.email) as EditText
//        password = findViewById(R.id.enter_password) as EditText
//        login = findViewById(R.id.login) as Button
    }

//    fun login() {
//        Log.d(TAG, "Login")
//
//        if (!validate()) {
//            onLoginFailed()
//            return
//        }
//
//        login!!.isEnabled = false
//
//        val progressDialog = ProgressDialog(this@LoginPage)
//        progressDialog.isIndeterminate = true
//        progressDialog.setMessage("Login...")
//        progressDialog.show()
//
//        val email = email!!.text.toString()
//        val password = enter_password!!.text.toString()
//
//        //todo: implement you own authentication logic
//
//        if (email == email && )
//
//        android.os.Handler().postDelayed(
//            {
//                // On complete call either onLoginSuccess or onLoginFailed
//                onLoginSuccess()
//                // onLoginFailed();
//                progressDialog.dismiss()
//            }, 3000)
//    }
//
//    fun onLoginFailed() {
//        Toast.makeText(baseContext, "Login failed; Please try again.", Toast.LENGTH_LONG).show()
//
//        login!!.isEnabled = true
//    }
//
//    fun onLoginSuccess() {
//        login!!.isEnabled = true
//        val myIntent = Intent(baseContext, AfterLogin::class.java)
//        startActivity(myIntent)
//
//    }
//
//    fun validate(): Boolean {
//        var valid = true
//
//        val email = email!!.text.toString()
//        val password = enter_password!!.text.toString()
//
//        if (email.isEmpty()) {
//            // email!!.error = null does not work
//            print("incorrect email")
//            var email = null;
//            valid = false
//        }
//        else {
//            var email = null
//        }
//
//        return valid
//    }

    fun afterLogin(v: View?) {
        val myIntent = Intent(baseContext, AfterLogin::class.java)
        startActivity(myIntent)
    }

    fun registerPage(v: View?) {
        val myIntent = Intent(baseContext, RegisterPage::class.java)
        startActivity(myIntent)
    }

//    companion object {
//        private val TAG = "LoginActivity"
//    }
}
