package com.example.app.view.activity

import android.os.Bundle
import com.arellomobile.mvp.presenter.InjectPresenter
import com.arellomobile.mvp.presenter.ProvidePresenter
import com.arellomobile.mvp.viewstate.strategy.OneExecutionStateStrategy
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType
import com.example.app.myapplication.R
import com.example.app.view.base.BaseActivity
import com.example.app.view.base.BaseView
import com.example.app.view.fragment.ImportantFragment
import dagger.Lazy
import javax.inject.Inject

interface MainView : BaseView {
    @StateStrategyType(OneExecutionStateStrategy::class)
    fun showImportantFragment()
}

class MainActivity : BaseActivity(), MainView {

    @Inject
    lateinit var daggerPresenter: Lazy<MainPresenter>

    @InjectPresenter
    lateinit var presenter: MainPresenter

    @ProvidePresenter
    fun providePresenter() = daggerPresenter.get()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun showImportantFragment() {
        supportFragmentManager.beginTransaction().add(R.id.frameLayout, ImportantFragment())
                .commit()
    }
}
