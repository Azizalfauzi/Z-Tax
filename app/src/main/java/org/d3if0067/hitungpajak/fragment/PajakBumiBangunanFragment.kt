package org.d3if0067.hitungpajak.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_pajak_bumi_bangunan.*

import org.d3if0067.hitungpajak.R
import org.d3if0067.hitungpajak.databinding.FragmentPajakBumiBangunanBinding

/**
 * A simple [Fragment] subclass.
 */
class PajakBumiBangunanFragment : Fragment() {
    private lateinit var binding: FragmentPajakBumiBangunanBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_pajak_bumi_bangunan,
            container,
            false
        )

        binding.btHitungBumiBangunan.setOnClickListener {
            if (inp_luas_bangunan.text.isEmpty()) {
                inp_luas_bangunan.error = "Inputan Luas Bangunan Tidak Boleh Kosong!"
            } else if (inp_harga_bangunan.text.isEmpty()) {
                inp_harga_bangunan.error = "Inputan Harga Bangunan Tidak Boleh Kosong!"
            } else if (inp_luas_tanah.text.isEmpty()) {
                inp_luas_tanah.error = "Inputan Luas Tanah Tidak Boleh Kosong!"
            } else if (inp_harga_tanah.text.isEmpty()) {
                inp_harga_tanah.error = "Inputan Harga Tanah Tidak Boleh Kosong !"
            } else {
                val luas_bangunan = inp_luas_bangunan.text.toString().toLong()
                val harga_bangunan = inp_harga_bangunan.text.toString().toLong()
                val luas_tanah = inp_luas_tanah.text.toString().toLong()
                val harga_tanah = inp_harga_tanah.text.toString().toLong()
                val bundle = Bundle()
                bundle.putLong("luasBangunan", luas_bangunan)
                bundle.putLong("hargaBangunan", harga_bangunan)
                bundle.putLong("luasTanah", luas_tanah)
                bundle.putLong("hargaTanah", harga_tanah)
                it.findNavController().navigate(
                    R.id.action_pajakBumiBangunanFragment_to_hasilPajakBumiBangunanFragment,
                    bundle
                )
            }
        }
        return binding.root
    }

}
