package com.ab.andoridutils.extensions

import android.content.Context
import android.util.Log
import android.widget.Toast
import androidx.fragment.app.Fragment

fun Context.showToast(text: String?, duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, text, duration).show()
}

fun Fragment.showToast(text: String?, duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this.context, text, duration).show()
}

fun Any.loge(text: String) {
    Log.e(this::class.java.simpleName, text)
}

fun Any.logd(text: String) {
    Log.d(this::class.java.simpleName, text)
}

fun Any.logw(text: String) {
    Log.w(this::class.java.simpleName, text)
}

fun Any.logi(text: String) {
    Log.i(this::class.java.simpleName, text)
}

fun Any.logv(text: String) {
    Log.v(this::class.java.simpleName, text)
}



