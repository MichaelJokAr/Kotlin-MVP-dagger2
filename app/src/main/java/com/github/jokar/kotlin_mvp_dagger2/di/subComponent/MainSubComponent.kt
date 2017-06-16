package com.github.jokar.kotlin_mvp_dagger2.di.subComponent

import com.github.jokar.kotlin_mvp_dagger2.MainActivity
import com.github.jokar.kotlin_mvp_dagger2.di.module.MainPresenterModule
import dagger.Subcomponent
import dagger.android.AndroidInjector

/**
 * Created by JokAr on 2017/6/16.
 */
@Subcomponent(modules = arrayOf(MainPresenterModule::class))
interface MainSubComponent : AndroidInjector<MainActivity> {

    @Subcomponent.Builder
    abstract class Builder : AndroidInjector.Builder<MainActivity>()
}