package com.example.test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.widget.*
import org.w3c.dom.Text


var textView:TextView?=null
var cards:Map<Int, String>?=null
var current_card:Int?=null
var current_image:Int?= null
var card:ImageView?=null
var right_ans:Int?=null
var timerText:TextView?=null

var cardsImage = arrayOf(R.drawable.card_1, R.drawable.card_2, R.drawable.card_3, R.drawable.card_4,
    R.drawable.card_5, R.drawable.card_6, R.drawable.card_7, R.drawable.card_8, R.drawable.card_9, R.drawable.card_10,
    R.drawable.card_11, R.drawable.card_12, R.drawable.card_13, R.drawable.card_14, R.drawable.card_15,
    R.drawable.card_16, R.drawable.card_17, R.drawable.card_3, R.drawable.card_3, R.drawable.card_3, R.drawable.card_3,
    R.drawable.card_3, R.drawable.card_3, R.drawable.card_3, R.drawable.card_3, R.drawable.card_3, R.drawable.card_3, R.drawable.card_3,
    R.drawable.card_3, R.drawable.card_3, R.drawable.card_3, R.drawable.card_3,R.drawable.card_3, R.drawable.card_3,
    R.drawable.card_3, R.drawable.card_3, R.drawable.card_3, R.drawable.card_3, R.drawable.card_3, R.drawable.card_3, )

private var timer: CountDownTimer?= null


class Second_activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sc)
        textView = findViewById<TextView>(R.id.CountPush)

        timerText= findViewById<TextView>(R.id.Timer)

        current_card = 0
        right_ans = 0



        cards= mapOf(0 to "Лягушка", 1 to "Лягушка", 2 to "Ванна", 3 to "Лягушка", 4 to "Расческа", 5 to "Ванна", 6 to "Барамелька", 7 to "Расческа", 8 to "Барамелька", 9 to "Ванна",
            10 to "Лягушка", 11 to "Ванна", 12 to "Полотенце", 13 to "Барамелька", 14 to "Лягушка", 15 to "Ванна", 16 to "Полотенце")

        card = findViewById<ImageView>(R.id.Cards)
        card?.run { setImageResource(cardsImage[0]) }

        startCountDowmTimer(30000)

    }


    private fun startCountDowmTimer(timerMillies:Long){
        timer?.cancel()
        timer = object: CountDownTimer(timerMillies, 1000){
            override fun onTick(p0: Long) {
                timerText?.text  = "" + (p0 / 1000)

            }

            override fun onFinish() {
                val MainScreen = Intent(applicationContext, VictoryActivity::class.java)
                startActivity(MainScreen)
            }

        }.start()


    }


    fun Baramelyka(view: View) {
        var name: String
        name = "Барамелька"

        val countString = textView?.text.toString()
        println(current_card)

        var count: Int = Integer.parseInt(countString)
         if(cards!![current_card!!] == name) {
            count++
           right_ans = count

        }

        //card!!.setImageDrawable( ContextCompat.getDrawable(
         //   applicationContext, // Context
           /// R.drawable.card_2// Drawable
        //)
        //)

        current_card = current_card!! + 1
        card!!.setImageResource(cardsImage!![current_card!!])




        textView!!.text = count.toString()
    }


    fun Frog(view: View) {
        var name: String
        name = "Лягушка"

        val countString = textView?.text.toString()
        println(current_card)

        var count: Int = Integer.parseInt(countString)

            if (cards!![current_card!!] == name) {
                count++
                right_ans = count
            }
        current_card = current_card!! + 1
        card!!.setImageResource(cardsImage!![current_card!!])




        textView!!.text = count.toString()
    }

    fun Bath(view: View) {
        var name: String
        name = "Ванна"

        val countString = textView?.text.toString()
        println(current_card)

        var count: Int = Integer.parseInt(countString)
            if (cards!![current_card!!] == name) {
                count++
                right_ans = count

            }
        current_card = current_card!! + 1
        card!!.setImageResource(cardsImage!![current_card!!])

        textView!!.text = count.toString()

    }

    fun Towel(view: View) {
        var name: String
        name = "Полотенце"

        val countString = textView?.text.toString()
        println(current_card)

        var count: Int = Integer.parseInt(countString)

            if (cards!![current_card!!] == name) {
                count++
                right_ans=count
            }
        current_card = current_card!! + 1
        card!!.setImageResource(cardsImage!![current_card!!])
        textView!!.text = count.toString()
    }

    fun Hairbrush(view: View) {
        var name: String
        name = "Расческа"

        val countString = textView?.text.toString()
        println(current_card)

        var count: Int = Integer.parseInt(countString)

            if (cards!![current_card!!] == name) {
                count++
                right_ans = count
            }

        current_card = current_card!! + 1
        card!!.setImageResource(cardsImage!![current_card!!])



        textView!!.text = count.toString()
    }
    fun Back(view: View){
        val MainScreen = Intent(this, MainActivity::class.java)
        startActivity(MainScreen)
    }


}

