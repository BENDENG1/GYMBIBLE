package com.bendeng.gymbible

import android.app.Application
import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.preferencesDataStore
import com.bendeng.presentation.util.Constants.APP_NAME
import dagger.hilt.android.HiltAndroidApp


@HiltAndroidApp
class App : Application() {
    init {
        instance = this
    }

    override fun onCreate() {
        super.onCreate()
    }

    companion object{
        lateinit var instance : App
        val Context.dataStore: DataStore<Preferences> by preferencesDataStore(name = APP_NAME)
        fun getContext(): Context = instance.applicationContext
    }
}