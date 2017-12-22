package com.example.volodymyrstelmashchuk.myapplication

class UseCase3(private val serverDataSource: ServerDataSource) {

    companion object {
        fun make() : UseCase3 {
            return UseCase3(ServerDataSource.make())
        }
    }

}