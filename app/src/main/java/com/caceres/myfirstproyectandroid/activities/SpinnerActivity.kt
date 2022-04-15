package com.caceres.myfirstproyectandroid.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.Toast
import com.caceres.myfirstproyectandroid.R
import com.caceres.myfirstproyectandroid.showToastShortExtensionFunction
import kotlinx.android.synthetic.main.activity_spinner.*

class SpinnerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spinner)
        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, pos: Int, id: Long) {
                Toast.makeText(
                        parent.context,
                    "You have selected : " + parent.getItemAtPosition(pos).toString(),
                    Toast.LENGTH_SHORT
                ).show()
            }

            override fun onNothingSelected(arg: AdapterView<*>?) {}
        }
    }

    fun showvalue(view: android.view.View) {
        val item = spinner.selectedItem
        this.showToastShortExtensionFunction("You have selected : $item")
    }

}