package com.example.my_test_messenger.ui.fragments

import android.view.Menu
import android.view.MenuInflater
import com.example.my_test_messenger.R

class SettingsFragment : BaseFragment(R.layout.fragment_settings) {

    override fun onResume() {
        super.onResume()
        setHasOptionsMenu(true)
    }


    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        /**
         * ? - Null безопасный вызов. идет обращение к активити которого нету, можно указать !! что означает точное отсутствие Null
         * но если нет уверености лучше ставить - ?
         */
        activity?.menuInflater?.inflate(R.menu.settings_action_menu, menu)
    }
}