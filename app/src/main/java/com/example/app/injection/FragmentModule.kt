package com.example.app.injection

import com.example.app.view.fragment.ImportantFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentModule {
    @ContributesAndroidInjector
    abstract fun bindImportantFragment(): ImportantFragment
}