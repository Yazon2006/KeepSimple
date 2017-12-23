package com.example.volodymyrstelmashchuk.myapplication

import javax.inject.Inject

class AnotherPresenter @Inject constructor (private val useCase1: UseCase1, useCase2: UseCase2, useCase3: UseCase3) {

}