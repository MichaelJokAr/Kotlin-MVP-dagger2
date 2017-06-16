package com.github.jokar.kotlin_mvp_dagger2.di.component

import com.github.jokar.kotlin_mvp_dagger2.app.MyApplication
import com.github.jokar.kotlin_mvp_dagger2.di.module.AppModule
import com.github.jokar.kotlin_mvp_dagger2.di.module.MainActivityModule
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule

/**
 * Created by JokAr on 2017/6/16.
 */
@Component(modules = arrayOf(
        /* Use AndroidInjectionModule.class if you're not using support library */
        AndroidSupportInjectionModule::class,
        AppModule::class,
        MainActivityModule::class
))
interface AppComponent {
    fun inject(application: MyApplication)
}