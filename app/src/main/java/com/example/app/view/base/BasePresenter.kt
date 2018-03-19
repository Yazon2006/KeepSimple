package com.example.app.view.base

import com.arellomobile.mvp.MvpPresenter

abstract class BasePresenter<TPresenterView : BaseView> : MvpPresenter<TPresenterView>() {

}