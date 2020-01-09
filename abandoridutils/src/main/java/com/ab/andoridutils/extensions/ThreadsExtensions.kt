package com.ab.andoridutils.extensions

import android.app.Activity
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity

fun Activity.runOnBackgroundThread(runnable: Runnable): Thread {
    val thread = Thread(runnable)
    thread.start()
    return thread
}

fun FragmentActivity.runOnBackgroundThread(runnable: Runnable): Thread {
    val thread = Thread(runnable)
    thread.start()
    return thread
}

fun AppCompatActivity.runOnBackgroundThread(runnable: Runnable): Thread {
    val thread = Thread(runnable)
    thread.start()
    return thread
}

fun Fragment.runOnBackgroundThread(runnable: Runnable): Thread {
    val thread = Thread(runnable)
    thread.start()
    return thread
}

fun Thread.runOnUiThread(runnable: Runnable){
    val handler = Handler(Looper.getMainLooper())
    handler.post(runnable)
}