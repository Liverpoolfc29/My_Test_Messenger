package com.example.my_test_messenger.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.my_test_messenger.databinding.FragmentChatBinding


/**
 * A simple [Fragment] subclass.
 * Use the [ChatFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ChatFragment : Fragment() {
    private lateinit var mBinging: FragmentChatBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mBinging = FragmentChatBinding.inflate(layoutInflater)
        return mBinging.root
    }

    override fun onResume() {
        super.onResume()
    }

}