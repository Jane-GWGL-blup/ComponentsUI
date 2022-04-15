package com.caceres.myfirstproyectandroid.activities

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import com.caceres.myfirstproyectandroid.R
import com.caceres.myfirstproyectandroid.showToastShortExtensionFunction

class SimpleDialogActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simple_dialog)
    }

     fun showDialog(view: android.view.View) {
         val builder = AlertDialog.Builder(this)
         builder.setTitle("Titulo del alertDialog")
         builder.setMessage("Here is android alert dialog message")
        // Alert dialog button

             builder.setNeutralButton("OK",
                 DialogInterface.OnClickListener() { dialog, id ->
                     this.showToastShortExtensionFunction("Click Button")
                 })
         // Create the AlertDialog object and return it
         builder.create()
         builder.show()
    }
}