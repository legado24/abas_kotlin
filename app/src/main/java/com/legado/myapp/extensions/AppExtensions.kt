import android.app.Activity
import com.legado.myapp.activity.AppBaseActivity
import com.legado.myapp.extensions.callApi
import com.legado.myapp.extensions.getRestApis
import com.legado.myapp.extensions.toast
import com.legado.myapp.model.RequestModel
import com.legado.ventagps.model.LoginResponse

fun AppBaseActivity.signIn(userEmail: String, password: String, onResult: (Boolean) -> Unit, onError: (String) -> Unit) {

    val requestModel = RequestModel()
    requestModel.userEmail = userEmail
    requestModel.password = password
 showProgress(true)
    callApi(getRestApis(false).login(request = requestModel), onApiSuccess = {
        //saveLoginResponse(it,false, password, onResult, onError)
        toast("ok ")
        onResult(true)
    }, onApiError = {
        showProgress(false)
        onResult(false)
        onError(it)
    }, onNetworkError = {
        showProgress(false)
        //openLottieDialog() {
        signIn(userEmail, password, onResult, onError)
        //   }
    })
}

fun AppBaseActivity.saveLoginResponse(it: LoginResponse, isSocialLogin:Boolean, password: String, onResult: (Boolean) -> Unit, onError: (String) -> Unit) {
//    if (it.user_role?.isNotEmpty()!!) {
//        if (it.user_role[0] == "administrator") {
//            showProgress(false)
//            onError("Admin is not allowed")
//        } else {
////            if (it.user_id != null) {
////                getSharedPrefInstance().setValue(USER_ID, it.user_id)
////            }
////            getSharedPrefInstance().setValue(USER_DISPLAY_NAME, it.user_display_name)
////            getSharedPrefInstance().setValue(USER_EMAIL, it.user_email)
////            getSharedPrefInstance().setValue(USER_NICE_NAME, it.user_nicename)
////            getSharedPrefInstance().setValue(USER_TOKEN, it.token)
////            if (it.profile_image.isNotEmpty()){
////                getSharedPrefInstance().setValue(USER_PROFILE, it.profile_image)
////            }
////            getSharedPrefInstance().setValue(IS_SOCIAL_LOGIN,isSocialLogin)
////            getSharedPrefInstance().setValue(Constants.SharedPref.USER_PASSWORD, password)
//
////            callApi(getRestApis().retrieveCustomer(), onApiSuccess = { response ->
////                showProgress(false)
////                getSharedPrefInstance().setValue(Constants.SharedPref.SHOW_SWIPE, true)
////                getSharedPrefInstance().setValue(USER_FIRST_NAME, response.first_name)
////                getSharedPrefInstance().setValue(USER_LAST_NAME, response.last_name)
////                getSharedPrefInstance().setValue(USER_ROLE, response.role)
////                getSharedPrefInstance().setValue(USER_USERNAME, response.username)
////                getSharedPrefInstance().setValue(IS_LOGGED_IN, true)
////                onResult(true)
////            }, onApiError = {
////                showProgress(false)
////                onResult(false)
////                onError(it)
////            }, onNetworkError = {
////                showProgress(false)
////                noInternetSnackBar()
////            })
//        }
//    }
}

