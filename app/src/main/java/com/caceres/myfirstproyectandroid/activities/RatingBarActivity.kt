package com.caceres.myfirstproyectandroid.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.caceres.myfirstproyectandroid.R
import com.caceres.myfirstproyectandroid.formatRating
import com.caceres.myfirstproyectandroid.showToastLongApplicationContext
import kotlinx.android.synthetic.main.activity_rating_bar.*


class RatingBarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rating_bar)
    }
    fun rateSubmit(view: android.view.View) {
        val ratingValue = ratingBar.rating
        ratingDisplay.text = this.formatRating(ratingBar.rating)
            this.showToastLongApplicationContext("Rate: $ratingValue ")
    }

}