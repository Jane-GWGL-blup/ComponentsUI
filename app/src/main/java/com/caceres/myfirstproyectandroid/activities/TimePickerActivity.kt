package com.caceres.myfirstproyectandroid.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.caceres.myfirstproyectandroid.R
import com.caceres.myfirstproyectandroid.formatTime
import kotlinx.android.synthetic.main.activity_time_picker.*
import java.util.*

class TimePickerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_time_picker)
        timePicker.setIs24HourView(true)
        timePicker.setOnTimeChangedListener { view, hourOfDay, minute ->
            textView.text = this.formatTime(hourOfDay,minute)
        }

        // Optional: Set current time (Android time)
        val now = Calendar.getInstance()
        val hour = now[Calendar.HOUR_OF_DAY]
        val minute = now[Calendar.MINUTE]

        // This method was deprecated in API level 23. Use setHour() and setMinute()
        timePicker.currentHour = hour
        timePicker.currentMinute = minute
    }

    fun pick(view: android.view.View) {

       textView.text = this.formatTime(timePicker.currentHour,timePicker.currentMinute)
    }
}