package features.movielist.di

import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModel
import common.base.di.BaseActivityModule
import common.base.di.annotation.ViewModelKey
import common.navigation.MovieDetailFactory
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoMap
import features.movielist.activity.MovieListActivity
import features.movielist.viewmodel.MovieListViewModel
import sweetfactory.SweetFactory

@Module(includes = [BaseActivityModule::class])
abstract class MovieListModule {

    @Binds
    abstract fun bindsAppCompatActivity(activity: MovieListActivity): AppCompatActivity

    @Binds
    @IntoMap
    @ViewModelKey(MovieListViewModel::class)
    abstract fun bindsMovieListViewModel(viewModel: MovieListViewModel): ViewModel

    @Module
    companion object {
        @JvmStatic
        @Provides
        fun providesMovieDetailFactory(): MovieDetailFactory = SweetFactory.newInstanceOf(MovieDetailFactory::class.java)!!
    }
}