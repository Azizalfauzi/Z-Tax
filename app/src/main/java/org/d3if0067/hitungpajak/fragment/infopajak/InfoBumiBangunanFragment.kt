package org.d3if0067.hitungpajak.fragment.infopajak

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import org.d3if0067.hitungpajak.R

/**
 * A simple [Fragment] subclass.
 */
class InfoBumiBangunanFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_info_bumi_bangunan, container, false)
    }

}
