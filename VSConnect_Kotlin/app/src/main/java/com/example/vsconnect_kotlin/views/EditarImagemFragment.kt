package com.example.vsconnect_kotlin.views

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.vsconnect_kotlin.apis.EndpointInterface
import com.example.vsconnect_kotlin.apis.RetrofitConfig
import com.example.vsconnect_kotlin.databinding.FragmentEditarImagemBinding

class EditarImagemFragment : Fragment() {

    private var _binding: FragmentEditarImagemBinding? = null

    private val binding get() = _binding!!

    private val clienteRetrofit = RetrofitConfig.obterInstanciaRetrofit()

    private val endpoints = clienteRetrofit.create(EndpointInterface::class.java)

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {


        _binding = FragmentEditarImagemBinding.inflate(inflater, container, false)
        val root: View = binding.root

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}