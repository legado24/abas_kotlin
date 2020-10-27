package com.legado.myapp.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import androidx.fragment.app.Fragment
import com.legado.myapp.R
import com.legado.myapp.extensions.*
import com.legado.myapp.fragment.SignInFragment
import com.legado.myapp.fragment.SignUpFragment

class SignInUpActivity : AppCompatActivity() {
    var selectedFragment: Fragment? = null
    private val mSignInFragment: SignInFragment = SignInFragment()
    private val mSignUpFragment: SignUpFragment = SignUpFragment()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in_up)
        loadSignInFragment()
    }
:

    fun loadSignUpFragment() {
        if (mSignUpFragment.isAdded) {
            replaceFragment(mSignUpFragment, R.id.fragmentContainer)
            findViewById<FrameLayout>(R.id.fragmentContainer).fadeIn(500)
        } else {
            addFragment(mSignUpFragment, R.id.fragmentContainer)
        }
    }

    fun loadSignInFragment() {
        if (mSignInFragment.isAdded) {
            replaceFragment(mSignInFragment, R.id.fragmentContainer)
            findViewById<FrameLayout>(R.id.fragmentContainer).fadeIn(500)
        } else {
            addFragment(mSignInFragment, R.id.fragmentContainer)
        }
    }
}