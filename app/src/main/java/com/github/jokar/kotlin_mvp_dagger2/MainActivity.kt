package com.github.jokar.kotlin_mvp_dagger2

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.github.jokar.kotlin_mvp_dagger2.bean.UserInfo
import com.github.jokar.kotlin_mvp_dagger2.presenter.MainPresenter
import com.github.jokar.kotlin_mvp_dagger2.view.MainView
import dagger.android.AndroidInjection
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity(), MainView {
    @Inject
    lateinit var presenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter.getInfo()
    }

    override fun showInfo(info: UserInfo) {
        text.text = info.toString()
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.destroy()
    }
}
