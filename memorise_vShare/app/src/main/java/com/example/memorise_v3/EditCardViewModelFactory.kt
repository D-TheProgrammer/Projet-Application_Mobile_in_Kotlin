package com.example.memorise_v3

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class EditCardViewModelFactory(private val cardId: Long ,private val dao: CardDao)
    : ViewModelProvider.Factory{

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return modelClass.getConstructor(Long::class.java, CardDao::class.java).newInstance(cardId,dao)
    }
}