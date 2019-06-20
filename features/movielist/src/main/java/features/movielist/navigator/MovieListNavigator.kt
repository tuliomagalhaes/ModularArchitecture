package features.movielist.navigator

import androidx.appcompat.app.AppCompatActivity
import common.navigation.MovieDetailFactory
import javax.inject.Inject

class MovieListNavigator @Inject constructor(private val activity: AppCompatActivity,
                                             private val movieDetailFactory: MovieDetailFactory) {

    fun openMovieDetail(movieId: String) {
        activity.startActivity(movieDetailFactory.newIntent(activity))
    }

}