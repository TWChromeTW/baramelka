package com.example.test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class LawActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_law)
    }
    fun Back(view:View){
        val MainScreen = Intent(this, MainActivity::class.java)
        startActivity(MainScreen)
    }
}