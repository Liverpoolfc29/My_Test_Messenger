package com.example.my_test_messenger

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import com.example.my_test_messenger.activityes.RegisterActivity
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
         * При запуске МайнАктивити будет проверка авторизован пользователь или нет, если нет попадаем в окно регистрации пользователя
         */
        if (false) {
            setSupportActionBar(mToolbar)
            mAppDrawer.create()
            supportFragmentManager.beginTransaction()
                .replace(R.id.dataContainer, ChatsFragment()).commit()
        } else {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
    }


    private fun initFields() {
        /**
         * инициализация
         */
        mToolbar = mBinding.mainToolbar
        mAppDrawer = AppDrawer(this, mToolbar)
    }

}