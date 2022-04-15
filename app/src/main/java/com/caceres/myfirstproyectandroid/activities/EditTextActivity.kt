package com.caceres.myfirstproyectandroid.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_edit_text.*
import com.caceres.myfirstproyectandroid.R
import com.caceres.myfirstproyectandroid.edtData

class EditTextActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_text)
    }

    fun register(view: android.view.View){
        when (edtFirstName.text.isNotBlank() && edtLastName.text.isNotBlank()) {
            true -> tvDisplayName.text = this.edtData(edtFirstName.text,edtLastName.text)
            false -> tvDisplayName.text = getString(R.string.enter_text)
        }
    }
}