package org.d3if0067.hitungpajak.fragment.hasilpajak

import android.os.Bundle
import android.view.*
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import org.d3if0067.hitungpajak.R
import org.d3if0067.hitungpajak.databinding.FragmentHasilPajakKendaraanBermotorBinding
import org.d3if0067.hitungpajak.databinding.FragmentPajakKendaraanBermotorBinding

/**
 * A simple [Fragment] subclass.
 */
class HasilPajakKendaraanBermotorFragment : Fragment() {
    private lateinit var binding: FragmentHasilPajakKendaraanBermotorBinding
    private var total_kendaraan: Long = 0
    private var total_kendaraan2: Long = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_hasil_pajak_kendaraan_bermotor,
            container,
            false
        )
        argumentKendaraanBermotor()
        setHasOptionsMenu(true)
        return binding.root
    }

    private fun argumentKendaraanBermotor() {
        if (arguments != null) {
            val harga = arguments!!.getLong("harga")
            val kepemilikan = arguments!!.getString("kepemilikan")

            if (kepemilikan == "pertama") {
                binding.tvKepemilikan.text = kepemilikan

                binding.tvPajakKetentuan.text = "1.5"

                total_kendaraan = (harga * 0.015).toLong()
                binding.tvTotalPajakKendaraan.text = total_kendaraan.toString()
                total_kendaraan2 = ((harga * 0.015) / 12).toLong()
                binding.tvTotalPajakKendaraan2.text = total_kendaraan2.toString()
            } else if (kepemilikan == "kedua") {
                binding.tvKepemilikan.text = kepemilikan
                binding.tvPajakKetentuan.text = "1.5"
                total_kendaraan = (harga * 0.02).toLong()
                binding.tvTotalPajakKendaraan.text = total_kendaraan.toString()
                total_kendaraan2 = ((harga * 0.02) / 12).toLong()
                binding.tvTotalPajakKendaraan2.text = total_kendaraan2.toString()
            } else if (kepemilikan == "ketiga") {
                binding.tvKepemilikan.text = kepemilikan
                binding.tvPajakKetentuan.text = "1.5"
                total_kendaraan = (harga * 0.025).toLong()
                binding.tvTotalPajakKendaraan.text = total_kendaraan.toString()
                total_kendaraan2 = ((harga * 0.025) / 12).toLong()
                binding.tvTotalPajakKendaraan2.text = total_kendaraan2.toString()
            } else {
                Toast.makeText(context, "GAGAL", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        return inflater.inflate(R.menu.info_kendaraan_menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(
            item,
            view!!.findNavController()
        ) || super.onOptionsItemSelected(item)
    }
}
