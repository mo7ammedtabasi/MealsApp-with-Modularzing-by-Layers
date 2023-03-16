package com.mo7ammedtabasi.data.remote

import com.mo7ammedtabasi.domain.entity.CategoryResponse
import retrofit2.http.GET

interface ApiService {
    @GET("categories.php")
     suspend fun getMeals() : CategoryResponse


}