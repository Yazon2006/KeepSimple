package com.example.volodymyrstelmashchuk.myapplication

import android.app.Application
import android.content.Context

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        appContext = applicationContext
    }

    companion object {
        private lateinit var appContext: Context

        fun getApplicationContext(): Context {
            return appContext
        }
    }

}