package com.wpfl5.androidlibutils.ui.base

import androidx.lifecycle.*
import com.wpfl5.androidlibutils.ui.ViewModelDelegate
import kotlinx.coroutines.Dispatchers
import org.koin.core.KoinComponent
import org.koin.core.inject

open class BaseViewModel : ViewModel(), KoinComponent{
    val coroutineIoContext = viewModelScope.coroutineContext + Dispatchers.IO
    val delegate : ViewModelDelegate by inject()

}