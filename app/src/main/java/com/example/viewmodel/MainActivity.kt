package com.example.viewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.viewmodel.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private lateinit var viewModel: MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)
        saveInformation()

    }

    fun saveInformation() {
        with(binding) {
            txView2.text = viewModel.getCurrentInformation()
            btSend.setOnClickListener {
                txView2.text = viewModel.getTxtInformation("${etName.text}", "${etLastname.text}","${etPhone.text}", "${etDocument.text}", "${etAge.text}")
            }
        }
    }
}