package com.example.app.interactor

import com.example.app.data.DataBaseDataSource
import com.example.app.data.ServerDataSource
import javax.inject.Inject

class FirstInteractor @Inject constructor(private val serverDataSource: ServerDataSource,
                                          private val dataBaseDataSource: DataBaseDataSource) {

}