package com.sl.android.kotlindemo.viewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.*
import com.sl.android.kotlindemo.R
import kotlinx.android.synthetic.main.activity_view_model_aty.*

class ViewModelAty : AppCompatActivity() {

    val myViewModel:MyViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_model_aty)
        val nameObserver = Observer<String>{
            newName->
            //onChange
            tv_show_change.text = newName
        }
        myViewModel.currentName.observe(this,nameObserver)

        btn_change_click.setOnClickListener {
            val anotherName="John Doe"
            myViewModel.currentName.value=anotherName
        }

       val userName:LiveData<String> = Transformations.map(myViewModel.currentName){
           currentName->""
       }
    }
}
