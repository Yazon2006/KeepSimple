package com.example.volodymyrstelmashchuk.myapplication

class AnotherPresenter(private val useCase1: UseCase1, useCase2: UseCase2, useCase3: UseCase3) {

    fun make(): AnotherPresenter {
        return AnotherPresenter(UseCase1.make(), UseCase2.make(), UseCase3.make())
    }

}