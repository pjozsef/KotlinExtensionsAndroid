package com.github.pjozsef.extension.android.sharedpreferences

import android.content.SharedPreferences

inline fun SharedPreferences.edit(func: SharedPreferences.Editor.() -> Unit) {
    val editor = edit()
    editor.func()
    editor.apply()
}

fun <T> SharedPreferences.Editor.set(pair: Pair<String, T>) {
    when (pair.second) {
        is String -> putString(pair.first, pair.second as String)
        is Int -> putInt(pair.first, pair.second as Int)
        is Long -> putLong(pair.first, pair.second as Long)
        is Float -> putFloat(pair.first, pair.second as Float)
        is Boolean -> putBoolean(pair.first, pair.second as Boolean)
        else -> throw IllegalArgumentException("Unsupported value, type: ${pair.second.toString()}")
    }
}