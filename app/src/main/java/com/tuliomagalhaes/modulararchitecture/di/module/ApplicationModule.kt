package com.tuliomagalhaes.modulararchitecture.di.module

import android.content.Context
import androidx.lifecycle.ViewModelProvider
import com.tuliomagalhaes.modulararchitecture.MovieApp
import com.tuliomagalhaes.modulararchitecture.di.DaggerViewModelFactory
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class ApplicationModule {

    @Binds
    abstract fun bindsViewModelFactory(viewModelFactory: DaggerViewModelFactory): ViewModelProvider.Factory

    @Module
    companion object {
        @JvmStatic
        @Provides
        fun providesApplicationContext(application: MovieApp): Context = application
    }
}