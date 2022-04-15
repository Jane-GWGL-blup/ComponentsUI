package com.caceres.myfirstproyectandroid.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.caceres.myfirstproyectandroid.R
import kotlinx.android.synthetic.main.activity_toggle_button.*

class ToggleButtonActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val toggleButtonOn = "ToggleButton is ON"
        val toggleButtonOff = "ToggleButton is OFF"
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toggle_button)
        toggleButton1.setOnCheckedChangeListener { view, isChecked ->
            when (isChecked) {
                true -> textView1.text = toggleButtonOn
                false -> textView1.text = toggleButtonOff
            }
        }
        toggleButton2.setOnCheckedChangeListener { view, isChecked ->
            when (isChecked) {
                true -> textView2.text = toggleButtonOn
                false -> textView2.text = toggleButtonOff
            }
        }
    }
}