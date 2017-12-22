package com.example.volodymyrstelmashchuk.myapplication

import android.content.Context

class CacheDataSource(private val content : Context) {

    companion object {
        fun make() : CacheDataSource {
            return CacheDataSource(App.getApplicationContext())
        }
    }

}
