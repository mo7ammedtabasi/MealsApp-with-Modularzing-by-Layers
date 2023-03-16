package com.mo7ammedtabasi.mealsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.lifecycleScope
import com.mo7ammedtabasi.mealsapp.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    lateinit var mealsAdapter: MealsAdapter
    private val viewModel : MealsViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel.getMeals()
        mealsAdapter = MealsAdapter()

        lifecycleScope.launch {
            viewModel.categoryResponse.collect{
                mealsAdapter.submitList(it?.categories)
                binding.categoryRv.adapter = mealsAdapter
            }
        }


    }
}