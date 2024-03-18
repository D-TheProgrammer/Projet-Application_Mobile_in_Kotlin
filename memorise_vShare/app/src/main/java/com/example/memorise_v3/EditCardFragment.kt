package com.example.memorise_v3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.memorise_v3.databinding.FragmentEditCardBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [EditCardFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class EditCardFragment : Fragment() {

    private  var _binding: FragmentEditCardBinding? = null

    private  val binding get() = _binding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentEditCardBinding.inflate(inflater,container,false)
        val view= binding?.root

        val cardId = EditCardFragmentArgs.fromBundle(requireArguments()).cardId
        val application = requireNotNull(this.activity).application
        val dao = CardDatabase.getInstance(application).cardDao
        val viewModelFactory = EditCardViewModelFactory(cardId, dao)
        val viewModel = ViewModelProvider(this, viewModelFactory)[EditCardViewModel::class.java]

        binding?.viewModel = viewModel
        binding?.lifecycleOwner = viewLifecycleOwner

        viewModel.naviguerVersListe.observe(viewLifecycleOwner){ shouldNabigate ->
            if (shouldNabigate){
                val action = EditCardFragmentDirections.actionEditCardFragmentToCardFragment()
                view?.findNavController()?.navigate(action)
                viewModel.onNavigueeVersListe()
            }
        }



        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}