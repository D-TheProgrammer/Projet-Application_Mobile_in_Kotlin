package com.example.memorise_v3

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class EditCardViewModel(cardId:Long , private val dao: CardDao) : ViewModel(){

    val card = dao.get(cardId)
    private val _naviguerVersListe = MutableLiveData<Boolean>()
    val naviguerVersListe : LiveData<Boolean> get() = _naviguerVersListe

    fun updateCardItem() {
        viewModelScope.launch{
            card.value?.let { dao.update(it) }
            _naviguerVersListe.value = true
        }
    }

    fun deleteCardItem(){
        viewModelScope.launch{
            card.value?.let { dao.delete(it) }
            _naviguerVersListe.value = true
        }
    }

    fun onNavigueeVersListe(){
        _naviguerVersListe.value = false
    }

}