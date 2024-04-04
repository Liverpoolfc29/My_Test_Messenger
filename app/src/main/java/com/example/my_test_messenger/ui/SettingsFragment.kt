package com.example.my_test_messenger.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.my_test_messenger.R
import com.example.my_test_messenger.databinding.FragmentChatBinding
import com.example.my_test_messenger.databinding.FragmentSettingsBinding

/**
 * A simple [Fragment] subclass.
 * Use the [SettingsFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SettingsFragment : Fragment() {

    private lateinit var mBinging: FragmentSettingsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mBinging = FragmentSettingsBinding.inflate(layoutInflater)
        return mBinging.root
    }

    override fun onResume() {
        super.onResume()
    }

}