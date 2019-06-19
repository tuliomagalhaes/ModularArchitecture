package features.movielist

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import core.navigation.MovieListFactory
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
    }

}