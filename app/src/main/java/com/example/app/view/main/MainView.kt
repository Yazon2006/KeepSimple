package com.example.app.view.main

import com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType
import com.example.app.view.base.BaseView

@StateStrategyType(AddToEndSingleStrategy::class)
interface MainView : BaseView {
}