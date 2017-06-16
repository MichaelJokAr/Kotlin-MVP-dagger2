package com.github.jokar.kotlin_mvp_dagger2.presenter

import com.github.jokar.kotlin_mvp_dagger2.bean.UserInfo
import com.github.jokar.kotlin_mvp_dagger2.model.MainModel
import com.github.jokar.kotlin_mvp_dagger2.view.MainView
import javax.inject.Inject

/**
 * Created by JokAr on 2017/6/16.
 */
class MainPresenter @Inject constructor(var model: MainModel?, var view: MainView?) {

    fun getInfo() {
        model?.getInfo(object : MainModel.CallBack {
            override fun data(info: UserInfo) {
                view?.showInfo(info)
            }
        })
    }

    fun destroy() {
        model = null
        view = null
    }
}