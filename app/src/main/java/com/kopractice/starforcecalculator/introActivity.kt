package com.kopractice.starforcecalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.kopractice.starforcecalculator.databinding.ActivityIntroBinding
import com.kopractice.starforcecalculator.view.MainActivity

class introActivity : AppCompatActivity() {
    private lateinit var viewBinding: ActivityIntroBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)

        viewBinding = ActivityIntroBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        Glide.with(this).load(R.raw.pino).override(500,500).into(viewBinding.pinoGif)

        var handler = Handler()
        handler.postDelayed( {
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        },3000)}

        override fun onPause() {
            super.onPause()
            finish()
        }


    }



