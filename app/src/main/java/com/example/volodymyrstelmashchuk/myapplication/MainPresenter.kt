package com.example.volodymyrstelmashchuk.myapplication

class MainPresenter(private val useCase1: UseCase1, useCase2: UseCase2) {

    companion object {
        fun make(): MainPresenter {
            return MainPresenter(UseCase1.make(), UseCase2.make())
        }
    }

}