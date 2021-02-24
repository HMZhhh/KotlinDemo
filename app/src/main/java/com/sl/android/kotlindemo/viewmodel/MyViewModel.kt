package com.sl.android.kotlindemo.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/**
 * @author  sunlong
 * @createTime  2021/01/26
 **/
class MyViewModel : ViewModel() {

    val currentName:MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }
    
}