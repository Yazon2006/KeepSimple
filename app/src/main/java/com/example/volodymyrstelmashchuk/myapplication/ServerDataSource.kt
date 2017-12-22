package com.example.volodymyrstelmashchuk.myapplication

import android.content.Context

class ServerDataSource(private val context : Context) {

    companion object {
        fun make() : ServerDataSource {
            return ServerDataSource(App.getApplicationContext())
        }
    }

}