package com.tuliomagalhaes.modulararchitecture

import android.app.Application
import features.moviedetail.di.movieDetailModule
import features.movielist.di.movieListModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MovieApp : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@MovieApp)
            modules(listOf(
                movieDetailModule,
                movieListModule
            ))
        }
    }

}