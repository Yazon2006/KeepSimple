package com.example.app.interactor

import com.example.app.data.AnotherOneRepository
import javax.inject.Inject

class ThirdInteractor @Inject constructor(
        private val serverDataSource: AnotherOneRepository
)