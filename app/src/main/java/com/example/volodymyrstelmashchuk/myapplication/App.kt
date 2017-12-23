package com.example.volodymyrstelmashchuk.myapplication

import android.app.Application
import com.example.volodymyrstelmashchuk.myapplication.injection.*

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder()
                .appModule(AppModule(this))
                .build()

        screenComponent = DaggerScreenComponent.builder()
                .appComponent(appComponent)
                .build()
    }

    companion object {
        lateinit var appComponent: AppComponent
            private set
        lateinit var screenComponent: ScreenComponent
            private set
    }

}