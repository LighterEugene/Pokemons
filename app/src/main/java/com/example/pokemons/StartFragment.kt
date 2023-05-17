package com.example.pokemons

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.pokemons.adapter.PokemonAdapter
import com.example.pokemons.data.Result
import com.example.pokemons.databinding.FragmentStartBinding


class StartFragment : Fragment(), StartView {

    var presenter: StartPresenter? = null
    var binding: FragmentStartBinding? = null
    var adapter = PokemonAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        presenter = StartPresenter(this)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentStartBinding.inflate(inflater, container, false)
        binding?.rv?.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        binding?.rv?.adapter = adapter
        return binding?.root
    }

    companion object {

        @JvmStatic
        fun newInstance() =
            StartFragment().apply {

            }
    }

    override fun update(items: List<Result>) {
        adapter.updateItems(items)
    }
}