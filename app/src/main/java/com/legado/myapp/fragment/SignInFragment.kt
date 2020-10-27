package com.legado.myapp.fragment

import android.app.Activity
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.legado.myapp.R
import com.legado.myapp.activity.SignInUpActivity
import com.legado.myapp.extensions.onClick
import kotlinx.android.synthetic.main.fragment_sign_in.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [SignInFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SignInFragment : BaseFragment() {

    private var userEmail: String? = null
    private var password: String? = null
    private var mensaje: String?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            userEmail = arguments?.getString("userEmail")!!
            password = arguments?.getString("password")!!
            mensaje = arguments?.getString("mensaje")!!
         }
    }
    private fun initializeFragment() {
        etUserEmail.onFocusChangeListener = this
        etPassword.onFocusChangeListener = this
        etPassword.transformationMethod = biggerDotTranformation

        tvGoSignUp.onClick { (activity as SignInUpActivity ).loadSignUpFragment()}
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sign_in, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initializeFragment()
    }



    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment SignInFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            SignInFragment().apply {
//                arguments = Bundle().apply {
//                    putString(ARG_PARAM1, param1)
//                    putString(ARG_PARAM2, param2)
//                }
            }
    }
}