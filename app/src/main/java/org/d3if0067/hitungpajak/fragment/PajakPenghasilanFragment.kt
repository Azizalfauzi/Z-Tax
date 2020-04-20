package org.d3if0067.hitungpajak.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
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
//    private fun optionSelected2() {
//        val option = binding.spinnerHasilPenghasilan
//        val result = binding.textView70
//
//        val options =
//            arrayOf("-", "1", "2", "3")
//
////        option.adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, options)
//        option.adapter = ArrayAdapter.createFromResource(context,R.layout.,options)
//
//        option.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
//            override fun onNothingSelected(parent: AdapterView<*>?) {
//                result.text = "Tolong Pilih salah satu"
//            }
//
//            override fun onItemSelected(
//                parent: AdapterView<*>?,
//                view: View?,
//                position: Int,
//                id: Long
//            ) {
//                result.text = options.get(position)
//            }
//        }
//    }

}
