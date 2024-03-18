package com.example.memorise_v3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.memorise_v3.databinding.FragmentCardBinding


class CardFragment : Fragment() {


    //declaration binding object
    private var _binding : FragmentCardBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {//mise a jour de la view grace au fragment
        _binding = FragmentCardBinding.inflate(inflater,container,false)

        val application = requireNotNull(this.activity).application
        val dao = CardDatabase.getInstance(application).cardDao
        val viewModelFactory= CardViewModelFactory(dao)
        val viewModel = ViewModelProvider(this,viewModelFactory)[CardViewModel::class.java]
        val adapter = CardItemListAdapter{ cardId ->
            viewModel.onCardItemClicked(cardId)
        }
        binding.viewModel= viewModel
        binding.memocardList.adapter = adapter
        binding.lifecycleOwner = viewLifecycleOwner

        viewModel.cards.observe(viewLifecycleOwner){cardsList->
            cardsList?.let {
                adapter.submitList(it)
            }
        }

        viewModel.naviguerTouteCard.observe(viewLifecycleOwner){cardId ->
            cardId?.let {
                val action = CardFragmentDirections.actionCardFragmentToEditCardFragment(cardId)
                this.findNavController().navigate(action)
                viewModel.onCardItemNaviguee()
            }
        }



        return binding.root


    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding =null
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Utilisation du binding pour accéder aux éléments de la vue
        binding.buttonRevenirHomeFragmentCard.setOnClickListener {
            (requireActivity() as Main_DEBUT_APP).goToMain_debut_appActivity()
        }
    }





}
