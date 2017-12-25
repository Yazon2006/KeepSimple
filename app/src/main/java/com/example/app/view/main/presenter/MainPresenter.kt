package com.example.app.view.main.presenter

import com.arellomobile.mvp.InjectViewState
import com.arellomobile.mvp.MvpPresenter
import com.example.app.interactor.FirstInteractor
import com.example.app.interactor.SecondInteractor
import com.example.app.interactor.ThirdInteractor
import com.example.app.view.main.MainView
import javax.inject.Inject

@InjectViewState
class MainPresenter @Inject constructor(
        private val firstInteractor: FirstInteractor,
        private val secondInteractor: SecondInteractor,
        private val thirdInteractor: ThirdInteractor) : MvpPresenter<MainView>() {

}