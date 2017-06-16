package com.github.jokar.kotlin_mvp_dagger2.di.module

import android.app.Activity
import com.github.jokar.kotlin_mvp_dagger2.MainActivity
import com.github.jokar.kotlin_mvp_dagger2.di.subComponent.MainSubComponent
import dagger.Binds
import dagger.Module
import dagger.android.ActivityKey
import dagger.android.AndroidInjector
import dagger.multibindings.IntoMap

/**
 * Created by JokAr on 2017/6/16.
 */
@Module
abstract class MainActivityModule {
    @Binds
    @IntoMap
    @ActivityKey(MainActivity::class)
    internal abstract fun bind(builder: MainSubComponent.Builder): AndroidInjector.Factory<out Activity>
}