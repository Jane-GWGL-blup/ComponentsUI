package com.caceres.myfirstproyectandroid.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.caceres.myfirstproyectandroid.R
import com.caceres.myfirstproyectandroid.showToastShortApplicationContext
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_snackbar.*

class SnackbarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_snackbar)
    }

   fun showSnackbar(view: android.view.View) {
        val snackbar: Snackbar = Snackbar.make(
            coordinatorLayout,
            "Hello, I am Android Snackbar!",
            Snackbar.LENGTH_LONG
        ) // Snackbar message
        snackbar.setAction("Undo", View.OnClickListener() {
            //Snackbar action text
            view -> this.showToastShortApplicationContext("Undo proccess!")
        })
        snackbar.show()
    }
}