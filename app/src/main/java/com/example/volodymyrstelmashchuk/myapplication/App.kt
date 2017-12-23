package com.example.volodymyrstelmashchuk.myapplication

import android.app.Application
import com.example.volodymyrstelmashchuk.myapplication.injection.*

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder()
                .appModule(AppModule(this))
                .build()
    }

    companion object {
        lateinit var appComponent: AppComponent
            private set
    }

}