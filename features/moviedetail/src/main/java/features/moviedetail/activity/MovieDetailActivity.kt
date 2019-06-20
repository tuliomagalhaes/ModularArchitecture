package features.moviedetail.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import common.base.BaseActivity
import common.navigation.MovieDetailFactory
import features.moviedetail.R
import features.moviedetail.navigator.MovieDetailNavigator
import features.moviedetail.viewmodel.MovieDetailViewModel
import kotlinx.android.synthetic.main.activity_movie_detail.*
import sweetfactory.annotations.SweetFactoryDeclaration
import sweetfactory.annotations.SweetFactoryMethod
import javax.inject.Inject

@SweetFactoryDeclaration(factory = MovieDetailFactory::class)
class MovieDetailActivity : BaseActivity() {

    private val viewModel: MovieDetailViewModel by viewModel()
    @Inject lateinit var navigator: MovieDetailNavigator

    companion object {
        @JvmStatic
        @SweetFactoryMethod
        fun newIntent(context: Context): Intent = Intent(context, MovieDetailActivity::class.java)
    }

    override fun getLayoutId(): Int? = R.layout.activity_movie_detail

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        tvViewName.text = viewModel.viewName
    }

}