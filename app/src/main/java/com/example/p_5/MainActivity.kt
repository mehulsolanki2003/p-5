package com.example.p_5

import android.R
import android.media.MediaPlayer
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    // Instantiating the MediaPlayer class
    var music: MediaPlayer? = null
    override fun onCreate(
        savedInstanceState: Bundle?
    ) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_item)

        // Adding the music file to our
        // newly created object music
        music = MediaPlayer.create(
            this, R.raw.sound.mp3,
        )
    }

    // Plaing the music
    fun musicplay(v: View?) {
        music!!.start()
    }

    // Pausing the music
    fun musicpause(v: View?) {
        music!!.pause()
    }

    // Stoping the music
    fun musicstop(v: View?) {
        music!!.stop()
        music = MediaPlayer.create(
            this, R.raw.sound.mp3,
        )
    }

    fun musicpaus(view: View) {}
}