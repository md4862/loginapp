package com.example.myapplicationar

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text


class MainActivity2 : AppCompatActivity() {


    lateinit var user: EditText
    lateinit var pswd: EditText

    lateinit var login: Button
    lateinit var forgot: TextView
    val validateuser = "9442889914"
    val validatepswd = "arshad"




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main2)




        title = "login in"

        user = findViewById(R.id.user)
        pswd = findViewById(R.id.pswd)
        login = findViewById(R.id.login)
        forgot = findViewById(R.id.forgot)



        login.setOnClickListener {
            val user = user.text.toString()
            val pswd = pswd.text.toString()
            if ((user == validateuser) && (pswd == validatepswd)) {
                val intent = Intent(this@MainActivity2, MainActivity::class.java)
                startActivity(intent)

            } else {
                Toast.makeText(this@MainActivity2, "invalid credential", Toast.LENGTH_LONG).show()
            }


        }
    }


    override fun onPause() {
        super.onPause()
        finish()
    }




}

