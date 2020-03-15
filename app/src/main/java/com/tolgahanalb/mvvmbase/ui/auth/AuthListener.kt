package com.tolgahanalb.mvvmbase.ui.auth

interface AuthListener {
    fun onStarted()
    fun onSuccess()
    fun onFailure(message:String)
}