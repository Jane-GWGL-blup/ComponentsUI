package com.caceres.myfirstproyectandroid.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.caceres.myfirstproyectandroid.R
import com.caceres.myfirstproyectandroid.showToastShortExtensionFunction

class ImageButtonActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_button)
    }

    fun firstImageButton(view:android.view.View){
        showToastShortExtensionFunction("FirstImageButton")
    }

    fun secondImageButton(view:android.view.View){
        showToastShortExtensionFunction("secondImageButton")
    }
}