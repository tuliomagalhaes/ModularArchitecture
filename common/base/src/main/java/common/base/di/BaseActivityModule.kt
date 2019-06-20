package common.base.di

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import dagger.Module
import dagger.Provides

@Module
object BaseActivityModule {

    @Provides
    @JvmStatic
    fun providesFragmentManager(activity: AppCompatActivity): FragmentManager {
        return activity.supportFragmentManager
    }

}