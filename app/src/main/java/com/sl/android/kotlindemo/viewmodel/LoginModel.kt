package com.sl.android.kotlindemo.viewmodel

import android.content.Context
import android.content.Intent
import android.widget.Toast
import androidx.databinding.ObservableField
import com.sl.android.kotlindemo.MainActivity
import com.sl.android.kotlindemo.common.BaseConstant

/**
 * @author  sunlong
 * @createTime  2021/01/21
 **/


class LoginModel constructor(name: String, pwd: String, context: Context) {
    /**
     * ObservableField 构造函数，设置可观察的域
     */
    val n = ObservableField<String>(name)
    val p = ObservableField<String>(pwd)



    var context: Context = context

    /**
     * 用户名改变回调的函数
     */

    fun onNameChange(s: CharSequence) {
        n.set(s.toString())
    }

    fun onPwdChanged(s: CharSequence, start: Int, before: Int, count: Int) {
        p.set(s.toString())
    }

    fun login() {
        if (n.get().equals(BaseConstant.USER_NAME)
            && p.get().equals(BaseConstant.USER_PWD))
        {
            Toast.makeText(context,"账号密码正确",Toast.LENGTH_SHORT).show()
            val intent = Intent(context,MainActivity::class.java)
            context.startActivity(intent)
        }
    }

}