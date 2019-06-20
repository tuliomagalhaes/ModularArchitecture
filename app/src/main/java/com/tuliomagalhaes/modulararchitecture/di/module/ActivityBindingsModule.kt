package com.tuliomagalhaes.modulararchitecture.di.module

import dagger.Module
import dagger.android.ContributesAndroidInjector
import features.moviedetail.activity.MovieDetailActivity
import features.moviedetail.di.MovieDetailModule
import features.movielist.activity.MovieListActivity
import features.movielist.di.MovieListModule

@Module
abstract class ActivityBindingsModule {

    @ContributesAndroidInjector(modules = [MovieDetailModule::class])
    abstract fun MovieDetailActivity(): MovieDetailActivity

    @ContributesAndroidInjector(modules = [MovieListModule::class])
    abstract fun MovieMovieListActivity(): MovieListActivity

}