package features.movielist.viewmodel

import androidx.lifecycle.ViewModel
import javax.inject.Inject

class MovieListViewModel @Inject constructor() : ViewModel() {

    private val VIEW_NAME = "MovieList in ViewModel"

    var counter = 0
    set(value) {
        viewName = "$VIEW_NAME  $value"
        field = value
    }

    var viewName = VIEW_NAME

}