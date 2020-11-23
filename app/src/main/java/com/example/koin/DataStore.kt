package com.example.koin

import android.content.Context
import android.widget.Toast

class DataStore(private val context: Context) {
    fun displayToast() {
        Toast.makeText(context, "DataStore component injected!", Toast.LENGTH_SHORT).show()
    }
}