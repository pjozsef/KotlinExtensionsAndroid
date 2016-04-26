package com.github.pjozsef.extension.android.base64

import android.util.Base64

val ByteArray.base64: String
    get() = Base64.encodeToString(this, Base64.DEFAULT)
