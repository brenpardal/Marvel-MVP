package com.cleanapp.mvp.view

import android.app.Activity
import com.cleanapp.mvp.contract.MarvelContract
import com.cleanapp.mvp.view.base.ActivityView
import com.marvel.databinding.ActivityMainBinding

class MarvelView(activity: Activity, private val binding: ActivityMainBinding) :
    ActivityView(activity), MarvelContract.View {
}
