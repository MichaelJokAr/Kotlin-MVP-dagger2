package com.github.jokar.kotlin_mvp_dagger2.view

import com.github.jokar.kotlin_mvp_dagger2.bean.UserInfo

/**
 * Created by JokAr on 2017/6/16.
 */
interface MainView {
    fun showInfo(info: UserInfo)
}