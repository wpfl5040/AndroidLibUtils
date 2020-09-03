package com.wpfl5.androidlibutils.di

import com.wpfl5.androidlibutils.ui.ViewModelDelegate
import com.wpfl5.androidlibutils.ui.ViewModelDelegateImp
import org.koin.dsl.bind
import org.koin.dsl.module
import org.koin.experimental.builder.single

val eventModule = module {
    single<ViewModelDelegateImp>() bind ViewModelDelegate::class
}