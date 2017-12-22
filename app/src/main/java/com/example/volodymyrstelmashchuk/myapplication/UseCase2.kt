package com.example.volodymyrstelmashchuk.myapplication

class UseCase2(private val serverDataSource: ServerDataSource,
               private val cacheDataSource: CacheDataSource,
               private val dataSource: DataBaseDataSource) {

    companion object {
        fun make(): UseCase2 {
            return UseCase2(ServerDataSource.make(), CacheDataSource.make(),
                    DataBaseDataSource.make())
        }
    }

}