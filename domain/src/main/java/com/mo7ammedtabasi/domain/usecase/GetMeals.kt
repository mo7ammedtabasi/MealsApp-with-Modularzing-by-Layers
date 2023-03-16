package com.mo7ammedtabasi.domain.usecase

import com.mo7ammedtabasi.domain.repo.MealsRepo

class GetMeals(private val mealsRepo: MealsRepo) {
    suspend operator fun invoke() = mealsRepo.getMealsFromRemote()
}