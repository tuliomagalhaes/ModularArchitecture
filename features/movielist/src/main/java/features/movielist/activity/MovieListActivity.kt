package features.movielist.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import common.base.BaseActivity
import common.navigation.MovieListFactory
import features.movielist.R
import features.movielist.navigator.MovieListNavigator
import features.movielist.viewmodel.MovieListViewModel
import kotlinx.android.synthetic.main.activity_movie_list.*
import sweetfactory.annotations.SweetFactoryDeclaration
import sweetfactory.annotations.SweetFactoryMethod

@SweetFactoryDeclaration(factory = MovieListFactory::class)
class MovieListActivity : BaseActivity() {

    companion object {
        @JvmStatic
        @SweetFactoryMethod
        fun newIntent(context: Context): Intent = Intent(context, MovieListActivity::class.java)
    }

    override fun getLayoutId(): Int? = R.layout.activity_movie_list

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        btOpenMovieDetail.setOnClickListener {
//            navigator.openMovieDetail("")
        }
//        tvViewName.text = viewModel.viewName
    }

}