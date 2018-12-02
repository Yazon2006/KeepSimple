package com.example.app

import com.example.app.injection.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

class App : DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<DaggerApplication> {
        return DaggerAppComponent
                .builder()
                .application(this)
                .build()
    }

}