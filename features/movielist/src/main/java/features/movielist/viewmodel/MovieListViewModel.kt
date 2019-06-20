package features.movielist.viewmodel

import androidx.lifecycle.ViewModel

class MovieListViewModel : ViewModel() {

    private var counter = 0

    val viewName = "MovieList in ViewModel: ${counter++}"

}