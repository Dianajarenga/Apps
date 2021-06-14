package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)
    }
    lateinit var nextbtn5: Button
    fun castView(){
        nextbtn5=findViewById<Button>(R.id.nextbtn5)

    }

    fun nextActivity(){
        nextbtn5.setOnClickListener{
            val next= Intent(baseContext,MainActivity::class.java)
            startActivity(next)
        }
    }
}
