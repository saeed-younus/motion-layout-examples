package com.example.motionlayout

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_card_shuffle.setOnClickListener {
            val intent = Intent(this@MainActivity, CardShuffleActivity::class.java)
            startActivity(intent)
        }

        btn_faded.setOnClickListener {
            val intent = Intent(this@MainActivity, FadedAnimationActivity::class.java)
            startActivity(intent)
        }

        btn_scale_down.setOnClickListener {
            val intent = Intent(this@MainActivity, ScaleDownAnimationActivity::class.java)
            startActivity(intent)
        }

        btn_left_to_right.setOnClickListener {
            val intent = Intent(this@MainActivity, LeftToRightAnimationActivity::class.java)
            startActivity(intent)
        }

        btn_splash01.setOnClickListener {
            val intent = Intent(this@MainActivity, Splash01Activity::class.java)
            startActivity(intent)
        }

        btn_splash02.setOnClickListener {
            val intent = Intent(this@MainActivity, Splash02Activity::class.java)
            startActivity(intent)
        }

        btn_splash03.setOnClickListener {
            val intent = Intent(this@MainActivity, Splash03Activity::class.java)
            startActivity(intent)
        }

        btn_flutter.setOnClickListener {
            val intent = Intent(this@MainActivity, FlutterLikeAnimationActivity::class.java)
            startActivity(intent)
        }
    }
}
