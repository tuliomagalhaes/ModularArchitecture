package features.movielist.viewmodel

import androidx.lifecycle.ViewModel

class MovieListViewModel : ViewModel() {

    private val VIEW_NAME = "MovieList in ViewModel"

    var counter = 0
    set(value) {
        viewName = "$VIEW_NAME  $value"
        field = value
    }

    var viewName = VIEW_NAME

}