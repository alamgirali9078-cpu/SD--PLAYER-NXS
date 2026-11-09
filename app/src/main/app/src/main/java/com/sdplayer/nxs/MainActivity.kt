package com.sdplayer.nxs

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.widget.*
import android.view.Gravity

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL
        layout.gravity = Gravity.CENTER
        layout.setPadding(24, 24, 24, 24)
        layout.setBackgroundColor(Color.rgb(12, 12, 20))

        val title = TextView(this)
        title.text = "SD PLAYER NXS"
        title.textSize = 30f
        title.setTextColor(Color.rgb(180, 130, 255))
        title.gravity = Gravity.CENTER

        val subtitle = TextView(this)
        subtitle.text = "PREMIUM MUSIC PLAYER"
        subtitle.textSize = 14f
        subtitle.setTextColor(Color.WHITE)
        subtitle.gravity = Gravity.CENTER

        val play = Button(this)
        play.text = "▶  PLAY MUSIC"

        val status = TextView(this)
        status.text = "WELCOME TO SD PLAYER NXS"
        status.setTextColor(Color.WHITE)
        status.gravity = Gravity.CENTER

        play.setOnClickListener {
            status.text = "MUSIC PLAYER READY"
        }

        layout.addView(title)
        layout.addView(subtitle)
        layout.addView(play)
        layout.addView(status)

        setContentView(layout)
    }
}
