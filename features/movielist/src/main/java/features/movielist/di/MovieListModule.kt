package features.movielist.di

import androidx.appcompat.app.AppCompatActivity
import features.movielist.navigator.MovieListNavigator
import features.movielist.viewmodel.MovieListViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val movieListModule = module {
    viewModel { MovieListViewModel() }

    factory { (activity: AppCompatActivity) -> MovieListNavigator(activity, get()) }
}