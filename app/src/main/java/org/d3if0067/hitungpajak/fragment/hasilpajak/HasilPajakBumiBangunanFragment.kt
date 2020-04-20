package org.d3if0067.hitungpajak.fragment.hasilpajak

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import org.d3if0067.hitungpajak.R
import org.d3if0067.hitungpajak.databinding.FragmentHasilPajakBumiBangunanBinding

/**
 * A simple [Fragment] subclass.
 */
class HasilPajakBumiBangunanFragment : Fragment() {
    private lateinit var binding: FragmentHasilPajakBumiBangunanBinding
    private var njkp: Long = 0
    private var pbb: Long = 0
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding =
            DataBindingUtil.inflate(
                inflater,
                R.layout.fragment_hasil_pajak_bumi_bangunan,
                container,
                false
            )
        //hitung pajak bangunan
        calculatedPajak()
        setHasOptionsMenu(true)
        return binding.root
    }

    private fun calculatedPajak() {
        if (arguments != null) {
            //hitung bangunan
            val luas_bangunan = arguments!!.getLong("luasBangunan")
            val harga_bangunan = arguments!!.getLong("hargaBangunan")
            val total_bangunan = luas_bangunan * harga_bangunan

            binding.tvLuasBangunan.text = luas_bangunan.toString()
            binding.tvHargaBangunan.text = harga_bangunan.toString()
            binding.tvTotalBangunan.text = total_bangunan.toString()

            //hitung tanah
            val luas_tanah = arguments!!.getLong("luasTanah")
            val harga_tanah = arguments!!.getLong("hargaTanah")
            val total_tanah = luas_tanah * harga_tanah

            binding.tvLuasTanah.text = luas_tanah.toString()
            binding.tvHargaTanah.text = harga_tanah.toString()
            binding.tvTotalTanah.text = total_tanah.toString()

            //njop
            val njop = total_bangunan + total_tanah
            binding.tvNjop.text = njop.toString()
            //njkp

            njkp = (0.2 * njop).toLong()
            binding.tvNjkp.text = njkp.toString()
            //pbb
            pbb = (0.05 * njkp).toLong()
            binding.tvPbb.text = pbb.toString()

        }
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        return inflater.inflate(R.menu.info_bumibangunan_menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(
            item,
            view!!.findNavController()
        ) || super.onOptionsItemSelected(item)
    }
}
