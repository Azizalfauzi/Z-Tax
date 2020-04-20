package org.d3if0067.hitungpajak.fragment

import android.os.Bundle
import android.view.*
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import org.d3if0067.hitungpajak.R
import org.d3if0067.hitungpajak.databinding.FragmentHomeBinding


/**
 * A simple [Fragment] subclass.
 */
class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)
        binding.btPajakPenghasilan.setOnClickListener { v: View ->
            findNavController().navigate(R.id.action_homeFragment_to_pajakPenghasilanFragment)
        }
        binding.btPajakPbb.setOnClickListener { v: View ->
            findNavController().navigate(R.id.action_homeFragment_to_pajakBumiBangunanFragment)
        }
        binding.btPajakPkb.setOnClickListener { v: View ->
            findNavController().navigate(R.id.action_homeFragment_to_pajakKendaraanBermotorFragment)
        }
        setHasOptionsMenu(true)
        return binding.root
    }
}


