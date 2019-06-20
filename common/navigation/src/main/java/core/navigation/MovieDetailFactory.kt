package core.navigation

import android.content.Context
import android.content.Intent

interface MovieDetailFactory {

    fun newIntent(context: Context): Intent

}