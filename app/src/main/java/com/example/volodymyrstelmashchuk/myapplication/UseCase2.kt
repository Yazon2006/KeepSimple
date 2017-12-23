package com.example.volodymyrstelmashchuk.myapplication

import javax.inject.Inject

class UseCase2 @Inject constructor(private val serverDataSource: ServerDataSource,
                                   private val cacheDataSource: CacheDataSource,
                                   private val dataSource: DataBaseDataSource) {

}