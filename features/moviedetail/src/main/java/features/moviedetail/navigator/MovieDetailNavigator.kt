package features.moviedetail.navigator

import androidx.appcompat.app.AppCompatActivity
import javax.inject.Inject

class MovieDetailNavigator @Inject constructor(private val activity: AppCompatActivity) {

    fun onUnkownError() {
        // TODO: show simple dialog
    }

}