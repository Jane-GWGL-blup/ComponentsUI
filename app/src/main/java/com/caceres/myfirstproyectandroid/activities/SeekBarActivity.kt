package com.caceres.myfirstproyectandroid.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import com.caceres.myfirstproyectandroid.R
import android.widget.SeekBar.OnSeekBarChangeListener
import com.caceres.myfirstproyectandroid.seekBarText
import com.caceres.myfirstproyectandroid.showToastShortApplicationContext
import kotlinx.android.synthetic.main.activity_seek_bar.*

class SeekBarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seek_bar)

        // seekBar.setProgress(2);
        seekBar.setOnSeekBarChangeListener(object : OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
                tvCount.text = seekBarText(progress,seekBar.max)
                showToastShortApplicationContext("SeekBar Progress Change")

            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {
                showToastShortApplicationContext("SeekBar Touch Started")
            }

            override fun onStopTrackingTouch(seekBar: SeekBar) {
                showToastShortApplicationContext("SeekBar Touch Stop ")
            }
        })
    }
}