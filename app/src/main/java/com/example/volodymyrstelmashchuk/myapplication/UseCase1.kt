package com.example.volodymyrstelmashchuk.myapplication

import javax.inject.Inject

class UseCase1 @Inject constructor(private val serverDataSource: ServerDataSource,
                                   private val dataBaseDataSource: DataBaseDataSource) {

}