package com.example.volodymyrstelmashchuk.myapplication.view

import com.arellomobile.mvp.InjectViewState
import com.arellomobile.mvp.MvpPresenter
import com.example.volodymyrstelmashchuk.myapplication.interactor.FirstInteractor
import com.example.volodymyrstelmashchuk.myapplication.interactor.SecondInteractor
import com.example.volodymyrstelmashchuk.myapplication.interactor.ThirdInteractor
import javax.inject.Inject

@InjectViewState
class MainPresenter @Inject constructor(
        private val firstInteractor: FirstInteractor,
        private val secondInteractor: SecondInteractor,
        private val thirdInteractor: ThirdInteractor) : MvpPresenter<MainView>() {

}