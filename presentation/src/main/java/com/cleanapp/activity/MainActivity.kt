package com.cleanapp.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.cleanapp.mvp.contract.MarvelContract
import com.cleanapp.mvp.model.MarvelModel
import com.cleanapp.mvp.presenter.MarvelPresenter
import com.cleanapp.mvp.view.MarvelView
import com.marvel.R
import com.marvel.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var presenter: MarvelContract.Presenter
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        presenter = MarvelPresenter(MarvelModel(),MarvelView(this,binding))
    }
}
