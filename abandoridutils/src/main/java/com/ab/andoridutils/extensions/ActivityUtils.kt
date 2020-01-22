package com.ab.andoridutils.extensions

import android.app.Activity
import android.view.WindowManager

fun disableScreenshotFunctionality(activity: Activity) {
    activity.window.setFlags(WindowManager.LayoutParams.FLAG_SECURE, WindowManager.LayoutParams.FLAG_SECURE)
}