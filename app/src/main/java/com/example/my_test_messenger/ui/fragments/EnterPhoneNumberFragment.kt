package com.example.my_test_messenger.ui.fragments

import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.my_test_messenger.R
import kotlinx.android.synthetic.main.fragment_enter_phone_number.register_btn_next
import kotlinx.android.synthetic.main.fragment_enter_phone_number.register_input_phoneNumber

/**
 *
 */

class EnterPhoneNumberFragment : Fragment(R.layout.fragment_enter_phone_number) {

    override fun onStart() {
        super.onStart()
        register_btn_next.setOnClickListener { sendCode() }
    }

    private fun sendCode() {
        if (register_input_phoneNumber.text.toString().isEmpty()) {
            Toast.makeText(
                activity,
                getString(R.string.register_toast_enterPhone),
                Toast.LENGTH_SHORT
            ).show()
        } else {
            fragmentManager?.beginTransaction()
                ?.replace(R.id.registerDataContainer, EnterCodeFragment())
                ?.addToBackStack(null)
                ?.commit()
        }
    }

}