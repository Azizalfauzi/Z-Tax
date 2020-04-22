package org.d3if0067.hitungpajak.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_pajak_kendaraan_bermotor.*

import org.d3if0067.hitungpajak.R
import org.d3if0067.hitungpajak.databinding.FragmentPajakKendaraanBermotorBinding

/**
 * A simple [Fragment] subclass.
 */
class PajakKendaraanBermotorFragment : Fragment() {
    private lateinit var binding: FragmentPajakKendaraanBermotorBinding
    private var kepemilikan: String = ""
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
        optionSelected()
        binding.btKendaraanBermotor.setOnClickListener {
            if (inp_harga_kendaraan.text.isEmpty()) {
                inp_harga_kendaraan.error = "Inputan Harga Kendaraan Tidak Boleh Kosong!"
            } else {
                val bundle = Bundle()
                val inp_harga = inp_harga_kendaraan.text.toString().toLong()
                bundle.putString("kepemilikan", kepemilikan)
                bundle.putLong("harga", inp_harga)
                it.findNavController().navigate(
                    R.id.action_pajakKendaraanBermotorFragment_to_hasilPajakKendaraanBermotorFragment,
                    bundle
                )
            }
        }
        return binding.root
    }

    private fun optionSelected() {
        //spinner
        val listPenghasilan = arrayOf("pertama", "kedua", "ketiga")

        val spinner = binding.spinnerKendaraanKepemilikan

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

    private val selectedItem = object : AdapterView.OnItemSelectedListener {
        override fun onNothingSelected(parent: AdapterView<*>?) {}

        override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
            // ambil salah satu item di list negara
            val item = parent?.getItemAtPosition(position).toString()
            // set item tersebut ke global variable negara
            kepemilikan = item
        }

    }

}
