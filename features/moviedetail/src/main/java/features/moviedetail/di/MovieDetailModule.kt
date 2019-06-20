package features.moviedetail.di

import common.navigation.MovieDetailFactory
import common.navigation.MovieDetailFactoryImpl
import features.moviedetail.navigator.MovieDetailNavigator
import features.moviedetail.viewmodel.MovieDetailViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.module.Module
import org.koin.dsl.module

val movieDetailModule: Module = module {
    viewModel { MovieDetailViewModel() }

    factory { MovieDetailFactoryImpl() as MovieDetailFactory }

    factory { MovieDetailNavigator(get()) }
}