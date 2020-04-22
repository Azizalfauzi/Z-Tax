package org.d3if0067.hitungpajak.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.core.os.bundleOf

import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_pajak_penghasilan.*

import org.d3if0067.hitungpajak.R
import org.d3if0067.hitungpajak.databinding.FragmentPajakPenghasilanBinding

/**
 * A simple [Fragment] subclass.
 */
@Suppress("SpellCheckingInspection")
class PajakPenghasilanFragment : Fragment() {
    private lateinit var binding: FragmentPajakPenghasilanBinding

    private var status: Int = 0
    private var masaPenghasilan: Int = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_pajak_penghasilan, container, false)
        //spinner 1
        optionSelected()
        optionSelected2()

        binding.btHitungPenghasilan.setOnClickListener {
            if (inp_gaji_penghasilan.text.isEmpty()) {
                inp_gaji_penghasilan.error = "Gaji Tidak Boleh Kosong!"
            } else {
                val input_gaji = inp_gaji_penghasilan.text.toString().toInt()
                val bundle = Bundle()
                bundle.putInt("status", status)
                bundle.putInt("masa", masaPenghasilan)
                bundle.putInt("gaji", input_gaji)
                it.findNavController().navigate(
                    R.id.action_pajakPenghasilanFragment_to_hasilPajakPenghasilanFragment,
                    bundle
                )
            }
        }

        return binding.root
    }

    private fun optionSelected() {
        //spinner
        val listPenghasilan = arrayOf(0, 1, 2, 3)

        val spinner = binding.spinnerStatusPenghasilan

        val arrayAdapter =
            ArrayAdapter(
                requireContext(),
                android.R.layout.simple_spinner_item,
                listPenghasilan
            )

        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        spinner.adapter = arrayAdapter

        spinner.onItemSelectedListener = selectedItem

    }

    private fun optionSelected2() {
        val listPenghasilan = arrayOf(1, 12)

        val spinner = binding.spinnerHasilPenghasilan

        val arrayAdapter =
            ArrayAdapter(
                requireContext(),
                android.R.layout.simple_spinner_item,
                listPenghasilan
            )

        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        spinner.adapter = arrayAdapter

        spinner.onItemSelectedListener = selectedItem2
    }


    private val selectedItem = object : AdapterView.OnItemSelectedListener {
        override fun onNothingSelected(parent: AdapterView<*>?) {}

        override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
            // ambil salah satu item di list negara
            val item = parent?.getItemAtPosition(position).toString().toInt()
            // set item tersebut ke global variable negara
            status = item
        }

    }
    private val selectedItem2 = object : AdapterView.OnItemSelectedListener {
        override fun onNothingSelected(parent: AdapterView<*>?) {}

        override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
            // ambil salah satu item di list negara
            val item = parent?.getItemAtPosition(position).toString().toInt()
            // set item tersebut ke global variable negara
            masaPenghasilan = item
        }

    }
}
