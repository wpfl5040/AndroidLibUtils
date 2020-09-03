package com.wpfl5.androidlibutils.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.wpfl5.androidlibutils.R
import com.wpfl5.androidlibutils.databinding.ActivityMainBinding
import com.wpfl5.androidlibutils.ui.base.BaseActivity
import org.koin.androidx.viewmodel.ext.android.viewModel
class MainActivity : BaseActivity<ActivityMainBinding, MainViewModel>(){
    override fun getLayoutRes(): Int = R.layout.activity_main
    override val viewModel: MainViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.apply {
            mainViewModel = viewModel
        }
    }
}