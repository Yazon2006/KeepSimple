package com.example.volodymyrstelmashchuk.myapplication.injection

import android.content.Context
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class])
interface AppComponent {
    fun provideContext(): Context
}