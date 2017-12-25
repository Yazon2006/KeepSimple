package com.example.app.injection

import android.content.Context
import com.example.app.view.main.presenter.MainPresenter
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class])
interface AppComponent {
    fun provideContext(): Context

    fun provideMainPresenter() : MainPresenter
}