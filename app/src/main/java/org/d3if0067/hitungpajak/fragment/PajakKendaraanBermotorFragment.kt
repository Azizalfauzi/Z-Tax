package org.d3if0067.hitungpajak.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController

import org.d3if0067.hitungpajak.R
import org.d3if0067.hitungpajak.databinding.FragmentPajakKendaraanBermotorBinding

/**
 * A simple [Fragment] subclass.
 */
class PajakKendaraanBermotorFragment : Fragment() {
    private lateinit var binding: FragmentPajakKendaraanBermotorBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_pajak_kendaraan_bermotor,
            container,
            false
        )
        binding.btKendaraanBermotor.setOnClickListener { v: View ->
            findNavController().navigate(R.id.action_pajakKendaraanBermotorFragment_to_hasilPajakKendaraanBermotorFragment)
        }
        return binding.root
    }

}
