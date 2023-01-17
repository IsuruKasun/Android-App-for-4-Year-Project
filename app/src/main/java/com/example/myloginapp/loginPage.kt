package com.example.myloginapp

import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.`loginPage.xml`)

        val Username = findViewById<View>(R.id.Username) as TextView
        val Password = findViewById<View>(R.id.Password) as TextView
        val enter = findViewById<View>(R.id.enter) as MaterialButton

        //admin and admin
        enter.setOnClickListener {
            if (Username.text.toString() == "admin" && Password.text.toString() == "admin") {
                //correct
                Toast.makeText(this@MainActivity, "LOGIN SUCCESSFUL", Toast.LENGTH_SHORT).show()
            } else  //incorrect
                Toast.makeText(this@MainActivity, "LOGIN FAILED !!!", Toast.LENGTH_SHORT).show()
        }
    }
}