package features.moviedetail.di

import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModel
import common.base.di.BaseActivityModule
import common.base.di.annotation.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import features.moviedetail.activity.MovieDetailActivity
import features.moviedetail.viewmodel.MovieDetailViewModel

@Module(includes = [BaseActivityModule::class])
abstract class MovieDetailModule {

    @Binds
    abstract fun bindsAppCompatActivity(activity: MovieDetailActivity): AppCompatActivity

    @Binds
    @IntoMap
    @ViewModelKey(MovieDetailViewModel::class)
    abstract fun bindsMovieDetailViewModel(viewModel: MovieDetailViewModel): ViewModel
}