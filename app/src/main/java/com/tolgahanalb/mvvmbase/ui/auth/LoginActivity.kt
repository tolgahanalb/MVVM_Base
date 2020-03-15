package com.tolgahanalb.mvvmbase.ui.auth

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.tolgahanalb.mvvmbase.R
import com.tolgahanalb.mvvmbase.databinding.ActivityLoginBinding
import com.tolgahanalb.mvvmbase.util.toast

class LoginActivity : AppCompatActivity(), AuthListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding : ActivityLoginBinding= DataBindingUtil.setContentView(this,R.layout.activity_login)
        val viewModel = ViewModelProvider(this).get(AuthViewModel::class.java)
        binding.viewmodel = viewModel

        viewModel.authListener = this
    }

    override fun onStarted() {
        toast("Login Started!")
    }

    override fun onSuccess() {
        toast("Login Success!")
    }

    override fun onFailure(message: String) {
        toast(message)
    }
}