package com.legado.myapp.model




class RequestModel {
    /**
     * Request for login
     */
    var usuario:String ?=null;
    var username: String? = null
    var userEmail:String?=null
    var password: String? = null

    var user_login: String? = null

    var user_id: String? = null
    /**
     * Request for social login
     */

    var accessToken: String? = null
    var firstName: String? = null
    var lastName: String? = null
    var loginType: String? = null
    var photoURL: String? = null
    /**
     * Request for post product review
     */
    var pro_id: String? = null
    var product_id: String? = null
    var review: String? = null
    var reviewer: String? = null
    var reviewer_email: String? = null
    var rating: String? = null

    /**
     * Request for update order
     */
    var status: String? = null

    /**
     * Request for delete product review
     */
    var force: Boolean? = null

    /**
     * Request for update review
     */
    var id: String? = null


    /**
     * Request for add item to cart
     */

    var cart_id: Int? = null
    var quantity: Int? = null
    var size: String? = null
    var color: String? = null

    /**
     * Request for Create /update cart item
     */
    var first_name: String? = null
    var last_name: String? = null
    var email: String? = null
    var mobile_no: String? = null
    var base64_img: String? = null



}
