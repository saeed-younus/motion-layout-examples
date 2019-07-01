package com.example.motionlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_splash01.*

class Splash02Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash02)

        var isTransitionToEnd = false

        btn_animate.setOnClickListener {
            if (!isTransitionToEnd) {
                isTransitionToEnd = true
                motion_layout.transitionToEnd()
            } else {
                isTransitionToEnd = false
                motion_layout.transitionToStart()
            }
        }
    }
}
