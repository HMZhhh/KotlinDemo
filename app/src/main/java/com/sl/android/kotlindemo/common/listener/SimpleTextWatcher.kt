package com.sl.android.kotlindemo.common.listener

import android.text.Editable
import android.text.TextWatcher

/**
 * @author  sunlong
 * @createTime  2021/01/22
 **/
open class SimpleTextWatcher :TextWatcher {
    override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
    }

    override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
    }

    override fun afterTextChanged(s: Editable?) {
    }
}