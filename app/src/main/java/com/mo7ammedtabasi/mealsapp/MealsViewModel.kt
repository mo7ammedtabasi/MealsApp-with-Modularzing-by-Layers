package com.mo7ammedtabasi.mealsapp

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mo7ammedtabasi.domain.entity.CategoryResponse
import com.mo7ammedtabasi.domain.usecase.GetMeals
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MealsViewModel @Inject constructor(
    private val getMealUseCase:GetMeals
) : ViewModel(){

    private val _categories : MutableStateFlow<CategoryResponse?> = MutableStateFlow(null)
    val categoryResponse : StateFlow<CategoryResponse?> = _categories

    fun getMeals(){
        viewModelScope.launch {
            try {
                _categories.value = getMealUseCase()
                Log.d("categoryResponseTAG", "categoryResponse : ${getMealUseCase()}")
            }catch (e:Exception){
                Log.e("categoryResponseTAG", "getMealsViewModel Error : $e", )
            }
        }
    }
}