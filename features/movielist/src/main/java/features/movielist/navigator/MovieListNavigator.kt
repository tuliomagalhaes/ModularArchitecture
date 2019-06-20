package features.movielist.navigator

import androidx.appcompat.app.AppCompatActivity
import common.navigation.MovieDetailFactory

class MovieListNavigator(private val activity: AppCompatActivity,
                         private val movieDetailFactory: MovieDetailFactory
) {

    fun openMovieDetail(movieId: String) {
        activity.startActivity(movieDetailFactory.newIntent(activity))
    }

}