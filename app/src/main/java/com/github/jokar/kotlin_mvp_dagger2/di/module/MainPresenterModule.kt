package com.github.jokar.kotlin_mvp_dagger2.di.module

import com.github.jokar.kotlin_mvp_dagger2.MainActivity
import com.github.jokar.kotlin_mvp_dagger2.model.MainModel
import com.github.jokar.kotlin_mvp_dagger2.view.MainView
import dagger.Module
import dagger.Provides

/**
 * Created by JokAr on 2017/6/16.
 */
@Module
class MainPresenterModule {

    @Provides
    fun modelProvider(): MainModel {
        return MainModel()
    }

    @Provides
    fun viewProvider(activity: MainActivity): MainView {
        return activity
    }
}