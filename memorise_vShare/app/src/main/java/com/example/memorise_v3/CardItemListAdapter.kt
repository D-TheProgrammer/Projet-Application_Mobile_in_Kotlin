package com.example.memorise_v3

import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.ViewParent
import android.widget.CheckBox
import android.widget.ListAdapter
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.memorise_v3.R
import com.example.memorise_v3.Card
import com.example.memorise_v3.databinding.CardListItemBinding
import kotlin.contracts.Returns


class CardItemListAdapter(private val clickListener : (cardId: Long) ->Unit): androidx.recyclerview.widget.ListAdapter<Card, CardItemListAdapter.CardItemListViewHolder>(CardItemCallback()) {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardItemListViewHolder =
        CardItemListViewHolder.inflateFrom(parent)

    //appeler par le recycler pour placer des elements a des position differencte
    override fun onBindViewHolder(holder: CardItemListViewHolder, position: Int) {
        val item = getItem(position)
        val cardView = holder.binding.root as CardView
        holder.bind(item, clickListener)
    }


    class CardItemListViewHolder (val binding: CardListItemBinding) : RecyclerView.ViewHolder(binding.root){
        //private val cardName = rootView.findViewById<CheckBox>(R.id.card_name)
        //private val cardTitre = rootView.findViewById<CheckBox>(R.id.memoTitre)
        //private val cardDescription = rootView.findViewById<CheckBox>(R.id.card_description)

        companion object{
            //
            fun inflateFrom(parent: ViewGroup): CardItemListViewHolder{
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = CardListItemBinding.inflate(layoutInflater,parent,false)
                return CardItemListViewHolder(binding)
            }
        }

        //pour mettre a jour les propriete de la checkbox et des element
        fun bind (item:Card , clickListener: (cardId: Long) -> Unit){
            binding.card = item
            binding.root.setOnClickListener {clickListener (item.id)}
            //cardTitre.text=item.titre
        }
    }
}