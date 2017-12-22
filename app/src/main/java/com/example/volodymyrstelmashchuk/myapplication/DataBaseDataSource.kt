package com.example.volodymyrstelmashchuk.myapplication

import android.content.Context

class DataBaseDataSource(private val content : Context) {

    companion object {
        fun make() : DataBaseDataSource {
            return DataBaseDataSource(App.getApplicationContext())
        }
    }

}
