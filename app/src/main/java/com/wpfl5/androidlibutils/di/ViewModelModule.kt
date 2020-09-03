package com.wpfl5.androidlibutils.di

import com.wpfl5.androidlibutils.ui.base.BaseViewModel
import com.wpfl5.androidlibutils.ui.main.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { MainViewModel() }
    viewModel { BaseViewModel() }
}