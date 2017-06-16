package com.github.jokar.kotlin_mvp_dagger2.model

import com.github.jokar.kotlin_mvp_dagger2.bean.UserInfo

/**
 * Created by JokAr on 2017/6/16.
 */
class MainModel {
    interface CallBack {
        fun data(info: UserInfo)
    }

    fun getInfo(callBack: CallBack) {
        callBack.data(UserInfo("Kotlin", 3))
    }
}