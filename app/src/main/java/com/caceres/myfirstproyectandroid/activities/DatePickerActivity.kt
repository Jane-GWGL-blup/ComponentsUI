package com.caceres.myfirstproyectandroid.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.caceres.myfirstproyectandroid.R
import com.caceres.myfirstproyectandroid.formatDate
import kotlinx.android.synthetic.main.activity_date_picker.*
import java.util.*

class DatePickerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_date_picker)

        // current date
        datePicker.init(Calendar.YEAR,Calendar.MONTH,Calendar.DAY_OF_MONTH)
         {  datePicker, year, month, dayOfMonth ->
             display_date.text = this.formatDate(dayOfMonth, month, year) }
    }

    fun pick(view: android.view.View) {
        display_date.text = this.formatDate(datePicker.dayOfMonth, datePicker.month, datePicker.year)
    }
}