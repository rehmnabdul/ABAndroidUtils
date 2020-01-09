package com.ab.andoridutils.extensions

import android.app.Activity
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity

fun Activity.showToast(text: String?, duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, text, duration).show()
}

fun FragmentActivity.showToast(text: String?, duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, text, duration).show()
}

fun AppCompatActivity.showToast(text: String?, duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, text, duration).show()
}



fun Activity.loge(text: String) {
    Log.e(this::class.java.simpleName, text)
}

fun AppCompatActivity.loge(text: String) {
    Log.e(this::class.java.simpleName, text)
}

fun Fragment.loge(text: String) {
    Log.e(this::class.java.simpleName, text)
}



