package com.afrodev.aula07.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.afrodev.aula07.R
import kotlinx.android.synthetic.main.fragment_segunda.*

class SegundaFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Infla o layout dessa fragment
        return inflater.inflate(R.layout.fragment_segunda, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val nomesDaGalera = listOf("Eduardo", "Natalia", "Pedro")
        val adapterListView = ArrayAdapter(requireContext(), android.R.layout.simple_list_item_1, nomesDaGalera)

        listExemplo.adapter = adapterListView
    }
}