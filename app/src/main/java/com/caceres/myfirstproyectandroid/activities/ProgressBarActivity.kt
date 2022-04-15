package com.caceres.myfirstproyectandroid.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.caceres.myfirstproyectandroid.R
import com.caceres.myfirstproyectandroid.showToastShortExtensionFunction
import kotlinx.android.synthetic.main.activity_progress_bar.*

class ProgressBarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_progress_bar)
        progressbar1.progress = 30
    }

    fun show(view: android.view.View) {
        val value = numberText.text.toString().toInt()
        if (value in 0..100){
            progressbar1.progress = value
        }else{
            showToastShortExtensionFunction("Número no valido")
        }

    }
}
