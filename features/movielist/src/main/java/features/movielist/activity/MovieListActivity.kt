package features.movielist.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import common.base.BaseActivity
import common.navigation.MovieListFactory
import features.movielist.R
import kotlinx.android.synthetic.main.activity_movie_list.*
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.viewModel
import features.movielist.navigator.MovieListNavigator
import features.movielist.viewmodel.MovieListViewModel
import org.koin.core.parameter.parametersOf
import sweetfactory.annotations.SweetFactoryDeclaration
import sweetfactory.annotations.SweetFactoryMethod

@SweetFactoryDeclaration(factory = MovieListFactory::class)
class MovieListActivity : BaseActivity() {

    private val viewModel: MovieListViewModel by viewModel()
    private val navigator: MovieListNavigator by inject { parametersOf(this) }

    companion object {
        @JvmStatic
        @SweetFactoryMethod
        fun newIntent(context: Context): Intent = Intent(context, MovieListActivity::class.java)
    }

    override fun getLayoutId(): Int? = R.layout.activity_movie_list

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        btOpenMovieDetail.setOnClickListener {
            viewModel.counter++
            navigator.openMovieDetail("")
        }
    }

    override fun onResume() {
        super.onResume()

        tvViewName.text = viewModel.viewName
    }

}