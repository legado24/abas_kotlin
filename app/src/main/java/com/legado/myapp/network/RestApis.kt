package com.iqonic.woobox.network


import com.legado.myapp.model.RequestModel
import com.legado.ventagps.model.LoginResponse
import com.legado.ventagps.model.User
import com.legado.ventagps.model.UserResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface RestApis {


    @GET("clientesByDiaV3")
    fun listarClientes(@Body request: RequestModel): Call<LoginResponse>

    @POST("login")
    fun login(@Body request: RequestModel): Call<UserResponse>

}
