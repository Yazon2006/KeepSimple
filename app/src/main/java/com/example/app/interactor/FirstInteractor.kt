package com.example.app.interactor

import com.example.app.data.AnotherOneRepository
import com.example.app.data.SomeRepository
import javax.inject.Inject

class FirstInteractor @Inject constructor(
        private val someRepository: SomeRepository,
        private val anotherOneRepository: AnotherOneRepository)