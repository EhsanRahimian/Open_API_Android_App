package com.nicootech.open_api_android_app.persistence

import androidx.room.Database
import androidx.room.RoomDatabase
import com.nicootech.open_api_android_app.models.AccountProperties
import com.nicootech.open_api_android_app.models.AuthToken

@Database(entities = [AuthToken::class, AccountProperties::class], version = 1)
abstract class AppDatabase: RoomDatabase() {

    abstract fun getAuthTokenDao(): AuthTokenDao

    abstract fun getAccountPropertiesDao(): AccountPropertiesDao

    companion object{
        const val DATABASE_NAME: String = "app_db"
    }

}