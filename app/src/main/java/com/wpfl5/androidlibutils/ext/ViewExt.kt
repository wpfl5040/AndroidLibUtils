package com.wpfl5.androidlibutils.ext

import android.view.View

fun View.visible(b: Boolean) {
    visibility = if(b) View.VISIBLE else View.INVISIBLE
}
fun View.gone() {
    visibility = View.GONE
}