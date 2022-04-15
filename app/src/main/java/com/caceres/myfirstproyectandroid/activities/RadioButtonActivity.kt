package com.caceres.myfirstproyectandroid.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.caceres.myfirstproyectandroid.R
import com.caceres.myfirstproyectandroid.showToastShortExtensionFunction
import kotlinx.android.synthetic.main.activity_radio_button.*

class RadioButtonActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_radio_button)
    }

    fun radioButtonClicked(view: android.view.View) {
        when (view.id) {
            R.id.radioButton1 -> {if (radioButton1.isChecked) this.showToastShortExtensionFunction("It seems like you feel RelativeLayout easy")}
            R.id.radioButton2 -> {if (radioButton2.isChecked) this.showToastShortExtensionFunction("It seems like you feel LinearLayout easy")}
            R.id.radioButton3 -> {if (radioButton3.isChecked) this.showToastShortExtensionFunction("It seems like you feel FrameLayout easy")}
            R.id.radioButton4 -> {if (radioButton4.isChecked) this.showToastShortExtensionFunction("It seems like you feel TableLayout easy")}
            R.id.radioButton5 -> {if (radioButton5.isChecked) this.showToastShortExtensionFunction("It seems like you feel GridLayout easy")}
        }
    }

    fun answer(view: android.view.View) {
        if (!radioGroup.isSelected) {
            this.showToastShortExtensionFunction("This field is required!")
        } else {
            // Individual selected
            when (radioGroup.checkedRadioButtonId) {
                R.id.radioButton1 -> this.showToastShortExtensionFunction("Its RadioButton1")
                R.id.radioButton2 -> this.showToastShortExtensionFunction("Is RadioButton2")
            }
        }
    }
}

