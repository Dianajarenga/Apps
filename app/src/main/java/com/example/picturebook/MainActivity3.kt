       package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

       class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        castView()
        nextActivity()
    }
    lateinit var nextbtn3: Button
    fun castView(){
        nextbtn3=findViewById<Button>(R.id.nextbtn3)

    }

    fun nextActivity(){
        nextbtn3.setOnClickListener{
            val next= Intent(baseContext,MainActivity4::class.java)
            startActivity(next)
        }
    }
}




