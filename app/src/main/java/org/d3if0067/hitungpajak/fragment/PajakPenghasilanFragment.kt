package org.d3if0067.hitungpajak.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController

import org.d3if0067.hitungpajak.R
import org.d3if0067.hitungpajak.databinding.FragmentPajakPenghasilanBinding

/**
 * A simple [Fragment] subclass.
 */
class PajakPenghasilanFragment : Fragment() {
    private lateinit var binding: FragmentPajakPenghasilanBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_pajak_penghasilan, container, false)
        binding.btHitungPenghasilan.setOnClickListener { v: View ->
            findNavController().navigate(R.id.action_pajakPenghasilanFragment_to_hasilPajakPenghasilanFragment)
        }
        return binding.root
    }

}
