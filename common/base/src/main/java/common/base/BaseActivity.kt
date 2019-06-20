package common.base

import android.os.Bundle

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

abstract class BaseActivity : DaggerAppCompatActivity() {

    @Inject
    lateinit var viewModeFactory: ViewModelProvider.Factory

    abstract fun getLayoutId(): Int?

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (getLayoutId() != null) {
            setContentView(getLayoutId()!!)
        }
    }

    inline fun <reified T : ViewModel> viewModel(): Lazy<T> = lazy {
        ViewModelProviders.of(this, this.viewModeFactory).get(T::class.java)
    }
}