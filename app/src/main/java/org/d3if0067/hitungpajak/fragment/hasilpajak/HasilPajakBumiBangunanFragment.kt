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
        setHasOptionsMenu(true)
        return binding.root
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
