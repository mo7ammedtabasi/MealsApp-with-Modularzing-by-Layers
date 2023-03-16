package com.mo7ammedtabasi.data.repo

import com.mo7ammedtabasi.data.remote.ApiService
import com.mo7ammedtabasi.domain.entity.CategoryResponse
import com.mo7ammedtabasi.domain.repo.MealsRepo

class MealsRepoImpl(private val apiService: ApiService) : MealsRepo {
    override suspend fun getMealsFromRemote(): CategoryResponse = apiService.getMeals()
}