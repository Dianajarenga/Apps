package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        castView()
        nextActivity()
    }
    lateinit var nextbtn4: Button
    fun castView(){
        nextbtn4=findViewById<Button>(R.id.nextbtn4)

    }

    fun nextActivity(){
        nextbtn4.setOnClickListener{
            val next= Intent(baseContext,MainActivity5::class.java)
            startActivity(next)
        }
    }
}
