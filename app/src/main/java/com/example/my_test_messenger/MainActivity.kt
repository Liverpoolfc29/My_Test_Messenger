package com.example.my_test_messenger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.my_test_messenger.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}