package com.caceres.myfirstproyectandroid.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.caceres.myfirstproyectandroid.R
import kotlinx.android.synthetic.main.activity_switch_button.*

class SwitchButtonActivity : AppCompatActivity() {
    private val switchOn = "Switch is ON"
    private val switchOff = "Switch is OFF"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_switch_button)

        // For first switch button
        switchButton.setOnCheckedChangeListener { view, isChecked ->
            when (isChecked) {
                true -> textView.text = switchOn
                false -> textView.text = switchOff
            }
        }

        switchButton.isChecked = true
        when (switchButton.isChecked) {
            true -> textView.text = switchOn
            false -> textView.text = switchOff
        }

        // for second switch button
        switchButton2.setOnCheckedChangeListener { view, isChecked ->
            when (isChecked) {
                true -> textView2.text = switchOn
                false -> textView2.text = switchOff
            }
        }

        switchButton2.isChecked = false
        when (switchButton2.isChecked) {
            true -> textView2.text = switchOn
            false -> textView2.text = switchOff
        }
    }
}