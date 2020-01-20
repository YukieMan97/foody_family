package com.example.foody

import android.app.ProgressDialog
import android.content.Intent
import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_register_as_consumer.*

class RegisterAsConsumer : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        // should not have variable name same as accessID
//        var first_name: EditText? = null
//        var last_name : EditText? = null
//        var birthday: EditText? = null
//        var postal_code: EditText? = null
//        var email: EditText? = null
//        var password: EditText? = null
//        var sign_up: Button? = null

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_as_consumer)

        // should not have variable name same as accessID
//        first_name = findViewById<EditText>(R.id.first_name)
//        last_name = findViewById<EditText>(R.id.last_name)
//        birthday = findViewById<EditText>(R.id.birthday)
//        postal_code = findViewById<EditText>(R.id.postal_code)
//        email = findViewById<EditText>(R.id.email)
//        password = findViewById<EditText>(R.id.enter_password)
//        sign_up = findViewById<Button>(R.id.signUp)

//        sign_up!!.setOnClickListener {
//            signUp()
//        }

    }

//    fun signUp() {
//        Log.d(TAG, "Sign up")
//
//        if (!validate()) {
//            onSignUpFailed()
//            return
//        }
//
//        signUp!!.isEnabled = false
//
//        val progressDialog = ProgressDialog(this@RegisterAsConsumer)
//        progressDialog.isIndeterminate = true
//        progressDialog.setMessage("Creating account...")
//        progressDialog.show()
//
//        val first_name = first_name!!.text.toString()
//        val last_name = last_name!!.text.toString()
//        val birthday = birthday!!.text.toString()
//        val postal_code = postal_code!!.text.toString()
//        val email = email!!.text.toString()
//        val password = enter_password!!.text.toString()
//
//        //todo: implement your own sign up logic here
//
//        android.os.Handler().postDelayed(
//            {
//                // On complete call either onSignupSuccess or onSignupFailed
//                // depending on success
//                onSignupSuccess()
//                // onSignupFailed();
//                progressDialog.dismiss()
//            }, 3000)
//    }
//
//    fun onSignupSuccess() {
//        signUp!!.isEnabled = true
//        val myIntent = Intent(baseContext, AfterLogin::class.java)
//        startActivity(myIntent)
//        finish()
//    }
//
//    fun onSignUpFailed() {
//        Toast.makeText(baseContext, "Sign up failed! Try again.",
//            Toast.LENGTH_LONG).show()
//
//        signUp!!.isEnabled = true
//    }
//
//    fun validate(): Boolean {
//        var valid = true
//
//        val first_name = first_name!!.text.toString()
//        val last_name = last_name!!.text.toString()
//        val birthday = birthday!!.text.toString()
//        val postal_code = postal_code!!.text.toString()
//        val email = email!!.text.toString()
//        val password = enter_password!!.text.toString()
//
//        if (first_name.isEmpty() || last_name.isEmpty() || first_name.isEmpty()
//            || first_name.isEmpty() || first_name.isEmpty() || first_name.isEmpty()) {
//            print("Please enter the missing information")
//            valid = false
//        }
//        // doesn't make variables null again if false bc, for example,
//        // first_name!!.error does not work ...
//        return valid
//    }

    fun afterLogin(v: View?) {
        val myIntent = Intent(baseContext, AfterLogin::class.java)
        startActivity(myIntent)
    }

    fun loginPage(v: View?) {
        val myIntent = Intent(baseContext, LoginPage::class.java)
        startActivity(myIntent)
    }

//    companion object {
//        private val TAG = "SignUpActivity"
//    }
}
