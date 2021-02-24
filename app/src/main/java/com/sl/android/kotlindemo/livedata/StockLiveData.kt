package com.sl.android.kotlindemo.livedata

import androidx.lifecycle.LiveData
import java.math.BigDecimal

/**
 * 官网单例
 * https://developer.android.google.cn/topic/libraries/architecture/livedata#kotlin
 * @author  sunlong
 * @createTime  2021/01/26
 **/
class StockLiveData (symbol:String):LiveData<BigDecimal>(){


    override fun onActive() {
        super.onActive()
    }


    override fun onInactive() {
        super.onInactive()
    }
}