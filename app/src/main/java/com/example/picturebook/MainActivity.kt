package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    castView()
    nextActivity()
    }
    lateinit var nextbtn:Button
   fun castView(){
       nextbtn=findViewById<Button>(R.id.nextbtn)

   }

    fun nextActivity(){
        nextbtn.setOnClickListener{
            val next=Intent(baseContext,MainActivity2::class.java)
            startActivity(next)
        }
    }
}
