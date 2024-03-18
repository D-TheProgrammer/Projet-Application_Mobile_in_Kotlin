package com.example.memorise_v3

import androidx.recyclerview.widget.DiffUtil

class CardItemCallback: DiffUtil.ItemCallback<Card>() {

    //permettra de comparer les elemnt et voir quand les update
    override fun areItemsTheSame(oldItem: Card, newItem: Card): Boolean = oldItem.id == newItem.id

    override fun areContentsTheSame(oldItem: Card, newItem: Card): Boolean = oldItem == newItem
}