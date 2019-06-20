package features.movielist.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import common.navigation.MovieListFactory
import features.movielist.R
import kotlinx.android.synthetic.main.activity_movie_list.*
import sweetfactory.annotations.SweetFactoryDeclaration
import sweetfactory.annotations.SweetFactoryMethod

@SweetFactoryDeclaration(factory = MovieListFactory::class)
class MovieListActivity : AppCompatActivity() {

    companion object {
        @JvmStatic
        @SweetFactoryMethod
        fun newIntent(context: Context): Intent = Intent(context, MovieListActivity::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_movie_list)

        btOpenMovieDetail.setOnClickListener {
//            navigator.openMovieDetail("")
        }
//        tvViewName.text = viewModel.viewName
    }

}