package com.example.motionlayout

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_card_shuffle.*

class CardShuffleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card_shuffle)

        text_register.setOnClickListener {
            motion_layout.transitionToEnd()
        }

        text_login.setOnClickListener {
            motion_layout.transitionToStart()
        }
    }
}
