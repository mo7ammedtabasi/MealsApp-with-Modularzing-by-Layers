package com.mo7ammedtabasi.mealsapp.di

import com.mo7ammedtabasi.data.remote.ApiService
import com.mo7ammedtabasi.data.repo.MealsRepoImpl
import com.mo7ammedtabasi.domain.repo.MealsRepo
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object RepoModule {

    @Provides
    fun provideRepo(apiService: ApiService):MealsRepo{
        return MealsRepoImpl(apiService)
    }
}