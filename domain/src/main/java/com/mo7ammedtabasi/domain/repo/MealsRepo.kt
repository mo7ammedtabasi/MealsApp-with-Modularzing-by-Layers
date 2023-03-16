package com.mo7ammedtabasi.domain.repo

import com.mo7ammedtabasi.domain.entity.CategoryResponse

interface MealsRepo {
    suspend fun getMealsFromRemote() : CategoryResponse
}