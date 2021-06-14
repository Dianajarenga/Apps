package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        castView()
        nextActivity()
    }
    lateinit var nextbtn2: Button
    fun castView(){
        nextbtn2=findViewById<Button>(R.id.nextbtn2)

    }

    fun nextActivity(){
        nextbtn2.setOnClickListener{
            val next= Intent(baseContext,MainActivity3::class.java)
            startActivity(next)
        }
    }
}







