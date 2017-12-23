package com.example.volodymyrstelmashchuk.myapplication.interactor

import com.example.volodymyrstelmashchuk.myapplication.data.DataBaseDataSource
import com.example.volodymyrstelmashchuk.myapplication.data.ServerDataSource
import javax.inject.Inject

class FirstInteractor @Inject constructor(private val serverDataSource: ServerDataSource,
                                          private val dataBaseDataSource: DataBaseDataSource) {

}