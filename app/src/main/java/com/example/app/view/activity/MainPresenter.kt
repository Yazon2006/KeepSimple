package com.example.app.view.activity

import com.arellomobile.mvp.InjectViewState
import com.example.app.interactor.SecondInteractor
import com.example.app.interactor.ThirdInteractor
import com.example.app.view.base.BasePresenter
import javax.inject.Inject

@InjectViewState
class MainPresenter @Inject constructor(
        private val secondInteractor: SecondInteractor,
        private val thirdInteractor: ThirdInteractor) : BasePresenter<MainView>() {

    override fun onFirstViewAttach() {
        super.onFirstViewAttach()
        viewState.showImportantFragment()
    }

}