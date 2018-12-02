package com.example.app.interactor

import com.example.app.data.AnotherOneRepository
import com.example.app.data.SomeRepository
import javax.inject.Inject

class SecondInteractor @Inject constructor(
        private val anotherOneRepository: AnotherOneRepository,
        private val someRepository: SomeRepository
)