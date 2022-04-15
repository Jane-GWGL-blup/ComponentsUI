package com.caceres.myfirstproyectandroid.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.caceres.myfirstproyectandroid.R
import com.caceres.myfirstproyectandroid.showToastShortExtensionFunction
import kotlinx.android.synthetic.main.activity_check_box.*


class CheckBoxActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_check_box)

        checkBox.isChecked = true
        if (checkBox.isChecked) this.showToastShortExtensionFunction("Android is checked!")

        }
        fun androidCheckBoxClicked(view: android.view.View) {
        // action for checkbox click
            when (view.id) {
                R.id.checkBox -> { if (checkBox.isChecked) this.showToastShortExtensionFunction("CheckBox is checked")}
                R.id.checkBox2 -> { if (checkBox2.isChecked) this.showToastShortExtensionFunction("CheckBox2 is checked")}
                R.id.checkBox3 -> { if (checkBox3.isChecked) this.showToastShortExtensionFunction("CheckBox3 is checked")}
                R.id.checkBox4 -> { if (checkBox4.isChecked) this.showToastShortExtensionFunction("CheckBox4 is checked")}
                R.id.checkBox5 -> { if (checkBox5.isChecked) this.showToastShortExtensionFunction("CheckBox5 is checked")}
                R.id.checkBox6 -> { if (checkBox6.isChecked) this.showToastShortExtensionFunction("CheckBox6 is checked")}
                R.id.checkBox7 -> { if (checkBox7.isChecked) this.showToastShortExtensionFunction("CheckBox7 is checked")}
                R.id.checkBox8 -> { if (checkBox8.isChecked) this.showToastShortExtensionFunction("CheckBox8 is checked")}
                R.id.checkBox9 -> { if (checkBox9.isChecked) this.showToastShortExtensionFunction("CheckBox9 is checked")}

            }
    }
}
