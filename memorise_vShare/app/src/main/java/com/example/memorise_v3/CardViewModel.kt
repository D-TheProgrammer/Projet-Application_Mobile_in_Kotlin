package com.example.memorise_v3

import android.adservices.adid.AdId
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.map
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class CardViewModel(val dao: CardDao): ViewModel (){
    var newCardTitre = ""
    var newCardDescription= ""
    var newCardTheme= ""
    var cards= dao.getAll()//ca va retourner une liste faut la formater

    private val _naviguerTouteCard = MutableLiveData<Long?>()
    val naviguerTouteCard: LiveData<Long?> get() = _naviguerTouteCard

    fun ajoutCard(){
        viewModelScope.launch {
            val card = Card()
            card.titre=newCardTitre
            card.description= newCardDescription
            card.theme= newCardTheme
            dao.insert(card)
        }
    }

    fun onCardItemClicked(cardId: Long){
        _naviguerTouteCard.value = cardId
    }

    fun onCardItemNaviguee(){
        _naviguerTouteCard.value = null
    }

}