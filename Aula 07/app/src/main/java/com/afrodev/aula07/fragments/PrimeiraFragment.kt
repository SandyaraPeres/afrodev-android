package com.afrodev.aula07.fragments

import android.content.Context
import android.os.Bundle
import android.os.Handler
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.afrodev.aula07.R
import kotlinx.android.synthetic.main.fragment_primeira.*

class PrimeiraFragment : Fragment() {

    //Uma mini-activity
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_primeira, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("Ciclo de vida de uma Fragment", "onCreate")
        txtPrimeiraFragment.text = "Oi!"
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.d("Ciclo de vida de uma Fragment", "onActivityCreated")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("Ciclo de vida de uma Fragment", "onCreate")
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d("Ciclo de vida de uma Fragment", "onAttach")

    }

    override fun onDetach() {
        super.onDetach()
        Log.d("Ciclo de vida de uma Fragment", "onDetach")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Ciclo de vida de uma Fragment", "onDestroy")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("Ciclo de vida de uma Fragment", "onDestroyView")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Ciclo de vida de uma Fragment", "onResume")
    }

    override fun onStart() {
        super.onStart()
        Log.d("Ciclo de vida de uma Fragment", "onStart")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Ciclo de vida de uma Fragment", "onCreate")
    }

}