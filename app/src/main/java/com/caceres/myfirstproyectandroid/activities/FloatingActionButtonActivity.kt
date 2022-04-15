package com.caceres.myfirstproyectandroid.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.caceres.myfirstproyectandroid.R
import com.caceres.myfirstproyectandroid.showToastShortExtensionFunction


class FloatingActionButtonActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_floating_action_button)

    }

    fun action(view: android.view.View) {
        this.showToastShortExtensionFunction("FAB Action")
    }
}