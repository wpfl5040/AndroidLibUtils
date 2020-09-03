package com.wpfl5.androidlibutils.ext

import android.app.AlertDialog
import android.content.Context
import android.content.DialogInterface

fun Context.alert( message: String = "", title: String, callback: (DialogInterface) -> Unit = {}) =
    AlertDialog.Builder(this).apply {
        if(title.isNotEmpty()) setTitle(title)
        setMessage(message)
        setPositiveButton(getString(android.R.string.ok)) { dialogInterface, _ ->
            callback(dialogInterface)
        }
        setCancelable(true)
        show()
    }

fun Context.permissionNeedDialog(message: String) = AlertDialog.Builder(this).apply {
    setTitle("권한 필요")
    setMessage(message)
    setPositiveButton("권한 설정"){ _, _ ->
        goToAppInfoPage()
    }
    setNegativeButton("닫기", null)
    show()
}
