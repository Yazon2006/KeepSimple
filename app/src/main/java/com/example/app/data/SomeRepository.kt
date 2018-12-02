package com.example.app.data

import com.example.app.data.api.DataBase
import com.example.app.data.api.ServerApi
import javax.inject.Inject

class SomeRepository @Inject constructor(
        private val api: ServerApi,
        private val dataBase: DataBase) {

}
