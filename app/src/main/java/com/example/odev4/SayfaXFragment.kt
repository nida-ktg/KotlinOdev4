package com.example.odev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.odev4.databinding.FragmentSayfaABinding
import com.example.odev4.databinding.FragmentSayfaXBinding

class SayfaXFragment : Fragment() {
    private lateinit var binding: FragmentSayfaXBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentSayfaXBinding.inflate(inflater, container, false)

        binding.buttonYdenMenuye.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.xten_yye)
        }

        return binding.root
    }

}