package com.sl.android.kotlindemo.ui.activity.ui.fragment.login

import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.sl.android.kotlindemo.MainActivity
import androidx.databinding.DataBindingUtil
import com.sl.android.kotlindemo.R
import com.sl.android.kotlindemo.databinding.FragmentLoginBinding
import com.sl.android.kotlindemo.viewmodel.LoginModel
import kotlinx.android.synthetic.main.fragment_login.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [LoginFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class LoginFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    lateinit var loginModel: LoginModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val binding :FragmentLoginBinding = DataBindingUtil.inflate(
            inflater
        ,R.layout.fragment_login
        ,container
        ,false
        )

        loginModel = LoginModel("","",context!!)
        binding.model = loginModel
        binding.activity=activity
        return binding.root

//        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        btn_login.setOnClickListener {
//            val intent = Intent(context,MainActivity::class.java)
//            context!!.startActivity(intent)
//        }
//
//        txt_cancel.setOnClickListener{
//            activity?.onBackPressed()
//        }
        val name = arguments?.getString("name")

        /*在Kotlin中!!跟?都是用于判断空参数异常的
        ?.意思是这个参数可以为空,并且程序继续运行下去
        !!.的意思是这个参数如果为空,就抛出异常*/
        loginModel.n.set(name!!)
        et_account.setText(name)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment LoginFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String?, param2: String?) =
            LoginFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}
