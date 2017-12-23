package com.example.volodymyrstelmashchuk.myapplication.interactor

import com.example.volodymyrstelmashchuk.myapplication.data.CacheDataSource
import com.example.volodymyrstelmashchuk.myapplication.data.DataBaseDataSource
import com.example.volodymyrstelmashchuk.myapplication.data.ServerDataSource
import javax.inject.Inject

class SecondInteractor @Inject constructor(private val serverDataSource: ServerDataSource,
                                           private val cacheDataSource: CacheDataSource,
                                           private val dataSource: DataBaseDataSource) {

}