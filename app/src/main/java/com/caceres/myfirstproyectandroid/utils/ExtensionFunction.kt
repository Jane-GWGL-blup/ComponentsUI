package com.caceres.myfirstproyectandroid

import android.content.Context
import android.text.Editable
import android.widget.EditText
import android.widget.Toast

fun Context.showToastShortExtensionFunction(message: CharSequence) = Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
fun Context.showToastLongApplicationContext(message: CharSequence) = Toast.makeText(applicationContext, message, Toast.LENGTH_LONG).show()
fun Context.showToastShortApplicationContext(message: CharSequence) = Toast.makeText(applicationContext, message, Toast.LENGTH_SHORT).show()
fun String.addMyText(message: CharSequence) = "My Text $message"

fun Context.formatDate(dayOfMonth: Int, month: Int, year: Int): String {
    val monthCorrect = month + 1
    return "Día: $dayOfMonth - Mes: $monthCorrect - Año: $year"
}
fun Context.formatTime(hourOfDay: Int, minute: Int): String{
    return "Time: $hourOfDay:$minute"
}

fun Context.formatRating(rating: Float): String{
    return "Rate: $rating"
}
fun Context.edtData(firstName: Editable, lastName: Editable): String{
    return "Your username is: $firstName $lastName"
}

fun Context.seekBarText(progress: Int, maxSeekBar: Int): String{
    return "Progress:  $progress / $maxSeekBar"
}