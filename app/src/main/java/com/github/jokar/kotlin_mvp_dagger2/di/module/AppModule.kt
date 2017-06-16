package com.github.jokar.kotlin_mvp_dagger2.di.module

import android.content.Context
import com.github.jokar.kotlin_mvp_dagger2.app.MyApplication
import com.github.jokar.kotlin_mvp_dagger2.di.subComponent.MainSubComponent
import dagger.Module
import dagger.Provides

/**
 * Created by JokAr on 2017/6/16.
 */
@Module(subcomponents = arrayOf(MainSubComponent::class))
class AppModule {
    @Provides
    fun contextProvider(application: MyApplication): Context {
        return application.applicationContext
    }
}