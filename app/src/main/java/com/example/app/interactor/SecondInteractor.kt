package com.example.app.interactor

import com.example.app.data.CacheDataSource
import com.example.app.data.DataBaseDataSource
import com.example.app.data.ServerDataSource
import javax.inject.Inject

class SecondInteractor @Inject constructor(private val serverDataSource: ServerDataSource,
                                           private val cacheDataSource: CacheDataSource,
                                           private val dataSource: DataBaseDataSource) {

}