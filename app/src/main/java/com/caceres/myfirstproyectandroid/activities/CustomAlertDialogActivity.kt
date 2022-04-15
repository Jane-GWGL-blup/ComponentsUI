package com.caceres.myfirstproyectandroid.activities

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.caceres.myfirstproyectandroid.R
import com.caceres.myfirstproyectandroid.showToastShortApplicationContext
import kotlinx.android.synthetic.main.custom_dialog.*

class CustomAlertDialogActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom_alert_dialog)
    }

    fun showDialog(view: android.view.View) {
        val dialog = Dialog(this)
        dialog.setContentView(R.layout.custom_dialog)
        // Custom Android Alert Dialog Title

        dialog.setTitle("Custom Dialog Example")

        val dialogButtonCancel: Button = dialog.customDialogCancel
        val dialogButtonOk: Button = dialog.customDialogOk
        // Click cancel to dismiss android custom dialog box
        dialogButtonCancel.setOnClickListener {
            this.showToastShortApplicationContext("Cancel process!")
            dialog.dismiss()

        }
        // Your android custom dialog ok action
        // Action for custom dialog ok button click
        dialogButtonOk.setOnClickListener {
            this.showToastShortApplicationContext("Success process!")
            dialog.dismiss()
        }

        dialog.show()
    }
}
