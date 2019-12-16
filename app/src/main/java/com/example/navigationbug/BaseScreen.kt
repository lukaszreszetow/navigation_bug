package com.example.navigationbug

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_base_screen.*

class BaseScreen : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("BaseScreen", "onCreate function called $this")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_base_screen, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        secondActivityButton.setOnClickListener {
            startActivity(Intent(context, SecondActivity::class.java))
        }
    }

    override fun onPause() {
        super.onPause()
        Log.d("BaseScreen", "onPause function called $this")
    }

    override fun onResume() {
        super.onResume()
        Log.d("BaseScreen", "onResume function called $this")
    }

    override fun onStop() {
        super.onStop()
        Log.d("BaseScreen", "onStop function called $this")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("BaseScreen", "onDestroy function called $this")
    }

    override fun onStart() {
        super.onStart()
        Log.d("BaseScreen", "onStart function called $this")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d("BaseScreen", "onSaveInstanceState function called $this")
    }
}
