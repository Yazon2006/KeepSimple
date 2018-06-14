package com.example.app.view.base

import android.content.Context
import android.support.v4.app.Fragment
import com.arellomobile.mvp.MvpAppCompatFragment
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.support.AndroidSupportInjection
import dagger.android.support.HasSupportFragmentInjector
import javax.inject.Inject

abstract class BaseFragment : MvpAppCompatFragment(), HasSupportFragmentInjector {
    
    @Inject
    lateinit var fragmentDispatchingAndroidInjector: DispatchingAndroidInjector<Fragment>
    
    override fun supportFragmentInjector(): AndroidInjector<Fragment> =
          fragmentDispatchingAndroidInjector
    
    override fun onAttach(context: Context?) {
        AndroidSupportInjection.inject(this)
        super.onAttach(context)
    }

}