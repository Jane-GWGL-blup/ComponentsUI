package com.caceres.myfirstproyectandroid.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.caceres.myfirstproyectandroid.R
import com.caceres.myfirstproyectandroid.addMyText
import com.caceres.myfirstproyectandroid.showToastShortExtensionFunction
import kotlinx.android.synthetic.main.activity_android_button.*

class AndroidButtonActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_android_button)
        changeTextButton()
        declareClickListener()
    }

    private fun changeTextButton() {
        /*Funcion agregada para cambiar de texto en el boton
        * se dejo para ver si el texto cambia o no, solo en btnSimpleButton*/
        Handler(Looper.getMainLooper()).postDelayed({ btnSimpleButton.text = "New Text SimpleButton" },4000)

    }

    private fun declareClickListener() {

        btnSimpleButton.setOnClickListener {
            this.showToastShortExtensionFunction("btnSimpleButton")
        }
        btnButtonLeftIconButton.setOnClickListener {
            this.showToastShortExtensionFunction("".addMyText("btnLeftIconButton"))
        }
        btnButtonRightIconButton.setOnClickListener{
            this.showToastShortExtensionFunction("".addMyText("btnRightIconButton"))
        }
        btnBackgroundImageButton.setOnClickListener{
            this.showToastShortExtensionFunction("btnBackgroundImageButton")
        }
        btnBorderButton.setOnClickListener {
            this.showToastShortExtensionFunction("btnBorderButton")
        }
        btnBorderRadiusButton.setOnClickListener {
            this.showToastShortExtensionFunction("btnBorderRadiusButton")
        }
        btnRoundButton.setOnClickListener {
            this.showToastShortExtensionFunction("btnRoundButton")
        }
        btnMaterialDesignButton.setOnClickListener {
            this.showToastShortExtensionFunction("btnMaterialDesignButton")
        }
        btnGradientButton.setOnClickListener {
            this.showToastShortExtensionFunction("btnGradientButton")
        }
    }




}