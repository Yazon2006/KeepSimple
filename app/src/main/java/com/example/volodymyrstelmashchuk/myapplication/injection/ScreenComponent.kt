package com.example.volodymyrstelmashchuk.myapplication.injection

import com.example.volodymyrstelmashchuk.myapplication.view.MainPresenter
import dagger.Component

@AppScope
@Component(dependencies = [AppComponent::class])
interface ScreenComponent {
    fun provideMainPresenter() : MainPresenter
}