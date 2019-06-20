package features.moviedetail.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import common.navigation.MovieDetailFactory
import features.moviedetail.R
import sweetfactory.annotations.SweetFactoryDeclaration
import sweetfactory.annotations.SweetFactoryMethod

@SweetFactoryDeclaration(factory = MovieDetailFactory::class)
class MovieDetailActivity : AppCompatActivity() {

    companion object {
        @JvmStatic
        @SweetFactoryMethod
        fun newIntent(context: Context): Intent = Intent(context, MovieDetailActivity::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_movie_detail)
    }

}