package com.ab.andoridutils.extensions

import android.content.Context
import android.content.pm.PackageManager

fun Context.checkIfPermissionGranted(permission: String): Boolean {
    return checkCallingOrSelfPermission(permission) == PackageManager.PERMISSION_GRANTED
}

