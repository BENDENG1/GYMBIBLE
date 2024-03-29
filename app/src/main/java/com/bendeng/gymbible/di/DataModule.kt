package com.bendeng.gymbible.di

import android.content.Context
import com.bendeng.gymbible.App.Companion.dataStore
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent


@Module
@InstallIn(SingletonComponent::class)
class DataModule {
    @Provides
    fun provideDataStore(@ApplicationContext context: Context) = context.dataStore
}