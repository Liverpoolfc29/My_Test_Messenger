package com.example.my_test_messenger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import com.example.my_test_messenger.databinding.ActivityMainBinding
import com.example.my_test_messenger.ui.fragments.ChatsFragment
import com.example.my_test_messenger.ui.objects.AppDrawer

/**
 * Главный класс приложения, определяет какая тема итд.
 */
class MainActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivityMainBinding
    private lateinit var mToolbar: Toolbar
    private lateinit var mAppDrawer: AppDrawer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        /**
         *  mBinding.root - обращение к самому макету
         */
        setContentView(mBinding.root)
    }

    override fun onStart() {
        super.onStart()
        initFields()
        initFunc()
    }

    private fun initFunc() {
        /**
         * функциональность и ее выполнение
         */
        setSupportActionBar(mToolbar)
        mAppDrawer.create()
        supportFragmentManager.beginTransaction()
            .replace(R.id.dataContainer, ChatsFragment()).commit()
    }


    private fun initFields() {
        /**
         * инициализация
         */
        mToolbar = mBinding.mainToolbar
        mAppDrawer = AppDrawer(this, mToolbar)
    }

}