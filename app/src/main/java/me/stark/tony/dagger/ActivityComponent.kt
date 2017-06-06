package me.stark.tony.dagger

import dagger.Component

@Component(dependencies = arrayOf(ActivityModule::class))
interface ActivityComponent {

    fun inject(activity: DaggerActivity)
}