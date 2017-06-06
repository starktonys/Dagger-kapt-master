package me.stark.tony.dagger

import dagger.Module
import dagger.Provides

@Module
class ActivityModule(private val activity: DaggerActivity) {

    @Provides
    fun provideActivity(): DaggerActivity = activity


}