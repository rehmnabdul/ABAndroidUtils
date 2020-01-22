package com.ab.andoridutils.extensions

import android.content.Context
import android.content.Intent

fun Context.broadcastData(data: String?, action: String?) {
    val i = Intent()
    i.putExtra("data", data)
    i.action = action
    sendBroadcast(i)
}