package com.example.my_test_messenger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import com.example.my_test_messenger.databinding.ActivityMainBinding
import com.example.my_test_messenger.ui.ChatFragment
import com.example.my_test_messenger.ui.SettingsFragment
import com.example.my_test_messenger.ui.objects.AppDrawer
import com.mikepenz.materialdrawer.AccountHeader
import com.mikepenz.materialdrawer.AccountHeaderBuilder
import com.mikepenz.materialdrawer.Drawer
import com.mikepenz.materialdrawer.DrawerBuilder
import com.mikepenz.materialdrawer.model.DividerDrawerItem
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem
import com.mikepenz.materialdrawer.model.ProfileDrawerItem
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem
import com.mikepenz.materialdrawer.util.DrawerItemViewHelper
import java.util.Objects

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
        supportFragmentManager.beginTransaction()
            .replace(R.id.dataContainer, ChatFragment()).commit()
    }


    private fun initFields() {
        /**
         * инициализация
         */
        mToolbar = mBinding.mainToolbar
        mAppDrawer = AppDrawer(this, mToolbar)
    }

}