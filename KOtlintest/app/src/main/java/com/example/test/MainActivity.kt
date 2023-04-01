package com.example.test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun StartGame(view:View){
        val MainScreen = Intent(this, Second_activity::class.java)
        startActivity(MainScreen)
    }
    fun Law(view: View){
        val MainScreen = Intent(this, LawActivity::class.java)
        startActivity(MainScreen)
    }
    fun CloseApp(view: View){
            finishAffinity()
        }

}