package com.example.apartmentfinder

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class LoginScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.loginscreen)

        findViewById<Button>(R.id.Loginbtn).setOnClickListener {



            val username = findViewById<EditText>(R.id.Usernametxt).text.toString()
            val password = findViewById<EditText>(R.id.Passwordtxt).text.toString()

            LoginUser(username, password)
        }




    }

}
private fun LoginUser(username: String, password: String) {

   /* if (password != null) {
        Toast.makeText(this," Logging in", Toast.LENGTH_SHORT).show()

    } else {

        Toast.makeText(this,"Error Logging in", Toast.LENGTH_SHORT).show()

    }*/
}

