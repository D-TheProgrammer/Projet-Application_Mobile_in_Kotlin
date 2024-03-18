package com.example.memorise_v3

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.example.memorise_v3.databinding.ActivityCreationMemocardBinding

class creation_memocard : AppCompatActivity() {

    private lateinit var binding: ActivityCreationMemocardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCreationMemocardBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val application = requireNotNull(this.application)
        val dao = CardDatabase.getInstance(application).cardDao
        val viewModelFactory = CardViewModelFactory(dao)
        val viewModel = ViewModelProvider(this, viewModelFactory)[CardViewModel::class.java]

        val adapter = CardItemListAdapter { cardId ->
            viewModel.onCardItemClicked(cardId)
        }

        binding.viewModel = viewModel
        //binding.memocardList.adapter = adapter
        binding.lifecycleOwner = this

        viewModel.cards.observe(this) { cardsList ->
            cardsList?.let {
                adapter.submitList(it)
            }
        }

        val buttonPageMain_creation = findViewById<ImageButton>(R.id.buttonRevenirHome_creation)
        buttonPageMain_creation.setOnClickListener {
            (this as Main_DEBUT_APP).goToMain_debut_appActivity()
        }
    }


}
