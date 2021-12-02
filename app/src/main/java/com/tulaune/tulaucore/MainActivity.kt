package com.tulaune.tulaucore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tulau.base.views.MyTextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var mtv = MyTextView(this)
    }
}