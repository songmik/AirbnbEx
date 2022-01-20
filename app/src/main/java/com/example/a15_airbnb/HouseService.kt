package com.example.a15_airbnb

import retrofit2.Call
import retrofit2.http.GET


interface HouseService {

    @GET("/v3/e0613394-f10c-4ac7-b87d-543abcaebaef")
    fun getHouseList(): Call<HouseDto>
}