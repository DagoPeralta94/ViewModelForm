package com.example.viewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
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
        viewModel.getCurrentInformation()
        saveInformation()

    }

    fun saveInformation() {
        with(binding) {
            btSend.setOnClickListener {
                viewModel.getTxtInformation(
                    "${etName.text}",
                    "${etLastname.text}",
                    "${etPhone.text}",
                    "${etDocument.text}",
                    "${etAge.text}"
                )
            }
        }
        viewModel.txtInformation.observe(this, Observer {
            binding.txView2.text = it
        })
    }
}