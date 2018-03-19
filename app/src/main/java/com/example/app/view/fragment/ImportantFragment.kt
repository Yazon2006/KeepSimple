package com.example.app.view.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.arellomobile.mvp.presenter.InjectPresenter
import com.arellomobile.mvp.presenter.ProvidePresenter
import com.example.app.myapplication.R
import com.example.app.view.base.BaseFragment
import javax.inject.Inject

class ImportantFragment : BaseFragment(), ImportantView {

    @Inject
    @InjectPresenter
    lateinit var presenter: ImportantPresenter

    @ProvidePresenter
    fun providePresenter() = presenter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_important, container, false)
    }

}