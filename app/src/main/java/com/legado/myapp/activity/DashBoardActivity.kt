package com.legado.myapp.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.multidex.BuildConfig
import com.google.gson.Gson
import com.legado.myapp.R
import com.legado.myapp.extensions.launchActivityWithNewTask
import com.legado.myapp.extensions.snackBarError
import com.legado.ventagps.model.CustomerListResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import signIn
import java.util.HashMap


class DashBoardActivity : AppBaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dash_board)
        doLogin()
    }

    private fun doLogin() {
       signIn(
            "CHINCHAH",
            "CHAH21",
            onResult = {
                if (it)  launchActivityWithNewTask<MainActivity>()
            },
            onError = {
               snackBarError(it)
            })

    }

}