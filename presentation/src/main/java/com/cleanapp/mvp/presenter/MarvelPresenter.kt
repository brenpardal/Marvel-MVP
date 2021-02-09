package com.cleanapp.mvp.presenter

import com.cleanapp.mvp.contract.MarvelContract

class MarvelPresenter(
    private val model: MarvelContract.Model,
    private val view: MarvelContract.View
) : MarvelContract.Presenter {
}
