package com.example.volodymyrstelmashchuk.myapplication

import javax.inject.Inject

class UseCase4 @Inject constructor(
        private val useCase1: UseCase1,
        private val useCase2: UseCase2,
        private val useCase3: UseCase3) {

}