package com.example.app.view.fragment

import com.arellomobile.mvp.InjectViewState
import com.example.app.interactor.FirstInteractor
import com.example.app.interactor.SecondInteractor
import com.example.app.view.base.BasePresenter
import javax.inject.Inject

@InjectViewState
class ImportantPresenter @Inject constructor(
        private val firstInteractor: FirstInteractor,
        private val secondInteractor: SecondInteractor
) : BasePresenter<ImportantView>() {

}