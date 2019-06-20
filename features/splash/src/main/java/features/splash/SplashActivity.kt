package features.splash

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import common.navigation.MovieListFactory
import sweetfactory.SweetFactory

class SplashActivity : AppCompatActivity() {

    private val movieListFactory = SweetFactory.newInstanceOf(MovieListFactory::class.java)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        startActivity(movieListFactory?.newIntent(this))
    }

}