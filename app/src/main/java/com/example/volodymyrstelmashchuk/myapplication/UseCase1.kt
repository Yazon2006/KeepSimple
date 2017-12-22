package com.example.volodymyrstelmashchuk.myapplication

class UseCase1(private val serverDataSource: ServerDataSource,
               private val dataBaseDataSource: DataBaseDataSource) {

    companion object {
        fun make(): UseCase1 {
            return UseCase1(ServerDataSource.make(), DataBaseDataSource.make())
        }
    }

}