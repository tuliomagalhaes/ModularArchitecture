package common.navigation

import android.content.Context
import android.content.Intent

interface MovieListFactory {

    fun newIntent(context: Context): Intent

}