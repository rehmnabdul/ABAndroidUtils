package com.ab.andoridutils.extensions

import android.content.Context
import android.os.Handler
import android.os.Looper

fun Any.runOnBackgroundThread(runnable: Runnable): Thread {
    val thread = Thread(runnable)
    thread.start()
    return thread
}

fun Context.runOnUiThread(runnable: Runnable){
    val handler = Handler(Looper.getMainLooper())
    handler.post(runnable)
}