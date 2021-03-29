package com.gmail.nguyenkimngan190920.tutle

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.Switch
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val hideSwitch = findViewById<Switch>(R.id.hideImgSwitch)
        val image = findViewById<ImageView>(R.id.imageView)
        hideSwitch.setOnCheckedChangeListener { _,isChecked ->
            if(!isChecked){
                image.visibility = View.VISIBLE
            }
            else{
                image.visibility = View.INVISIBLE
            }

        }
    }
    fun chooseTurle(view: View) {
        val chooseText = findViewById<TextView>(R.id.chooseTextView)
        val image = findViewById<ImageView>(R.id.imageView)
        when(view.id){
            R.id.doraemonBtn ->{
                chooseText.text = "You have chosen Doraemon!"
                image.setImageResource(R.drawable.doraemon)
            }
            R.id.nobitaBtn ->{
                chooseText.text = "You have chosen Nobita!"
                image.setImageResource(R.drawable.nobita)
            }
            R.id.xukaBtn ->{
                chooseText.text = "You have chosen Xuka!"
                image.setImageResource(R.drawable.xuka)
            }
            R.id.chaienBtn ->{
                chooseText.text = "You have chosen Chaien!"
                image.setImageResource(R.drawable.chaien)
            }
        }
    }
}