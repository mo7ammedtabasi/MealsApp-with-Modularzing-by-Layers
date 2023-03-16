package com.mo7ammedtabasi.mealsapp.di

import com.mo7ammedtabasi.domain.repo.MealsRepo
import com.mo7ammedtabasi.domain.usecase.GetMeals
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {

    @Provides
    fun provideUseCase(mealsRepo: MealsRepo): GetMeals {
        return GetMeals(mealsRepo)
    }
}