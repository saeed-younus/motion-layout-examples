package com.example.motionlayout

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_splash01.*

class Splash01Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash01)

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
