package com.wpfl5.androidlibutils.ui.base

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import com.wpfl5.androidlibutils.ext.setToastObserver
import com.wpfl5.androidlibutils.ext.Event
import com.wpfl5.androidlibutils.ext.EventObserver

abstract class BaseActivity<VDB: ViewDataBinding, VM: BaseViewModel>
    : AppCompatActivity() {
    lateinit var binding: VDB

    @LayoutRes
    abstract fun getLayoutRes(): Int
    abstract val viewModel : VM

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, getLayoutRes())
        binding.lifecycleOwner = this@BaseActivity

        viewModel.apply {
            setToastObserver(delegate.toastObservable)
            delegate.backBtnEvent.eventObserving { onBackPressed() }
        }


    }


    fun <T> LiveData<T>.observing(function: (T) -> Unit) {
        observe(this@BaseActivity, Observer{ function(it) })
    }

    fun <T> LiveData<Event<T>>.eventObserving(function: (T) -> Unit) {
        observe(this@BaseActivity,
            EventObserver { function(it) })
    }

}