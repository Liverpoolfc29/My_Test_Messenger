package com.example.my_test_messenger.ui.fragments

import android.text.Editable
import android.text.TextWatcher
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.my_test_messenger.R
import kotlinx.android.synthetic.main.fragment_enter_code.register_input_code

/**
 *
 */
class EnterCodeFragment : Fragment(R.layout.fragment_enter_code) {

    override fun onStart() {
        super.onStart()
        register_input_code.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            }

            override fun afterTextChanged(s: Editable?) {
                val string: String = register_input_code.text.toString()
                if (string.length == 6) {
                    verifyCode()
                }
            }
        })
    }

    private fun verifyCode() {
        Toast.makeText(activity, "OK bro", Toast.LENGTH_SHORT).show()
    }

}