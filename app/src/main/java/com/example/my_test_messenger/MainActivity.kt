package com.example.my_test_messenger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import com.example.my_test_messenger.databinding.ActivityMainBinding
import com.mikepenz.materialdrawer.util.DrawerImageLoader
import com.mikepenz.materialdrawer.util.DrawerItemViewHelper
import com.mikepenz.materialdrawer.widget.AccountHeaderView

class MainActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivityMainBinding
    private lateinit var mDriver: DrawerItemViewHelper
    private lateinit var mHeader: AccountHeaderView
    private lateinit var mToolbar: Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

}