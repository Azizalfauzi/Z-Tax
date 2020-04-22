package org.d3if0067.hitungpajak.fragment.hasilpajak

import android.os.Bundle
import android.view.*
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI

import org.d3if0067.hitungpajak.R
import org.d3if0067.hitungpajak.databinding.FragmentHasilPajakPenghasilanBinding

/**
 * A simple [Fragment] subclass.
 */
class HasilPajakPenghasilanFragment : Fragment() {
    private lateinit var binding: FragmentHasilPajakPenghasilanBinding
    private var total_pbb: Long = 0
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_hasil_pajak_penghasilan,
            container,
            false
        )
        argumentSpinner()
        setHasOptionsMenu(true)
        return binding.root
    }

    private fun argumentSpinner() {
        if (arguments != null) {
            val status = arguments!!.getInt("status")
            val masa = arguments!!.getInt("masa")
            val gaji = arguments!!.getInt("gaji")
            //hitung gaji kotor
            val total_penghasilan_kotor = gaji * 12

            //hitung masa penghasilan 1 bulan
            if (masa == 1) {
                //hitung gaji bersih 1 bulan
                if (status == 0) {
                    val nilaiStat1: Long = 54000000
                    val status_hitung = total_penghasilan_kotor - nilaiStat1
                    binding.tvTotalPenghasilanBersih.text = status_hitung.toString()
                    binding.tvTotalPenghasilanBersih2.text = status_hitung.toString()
                    binding.tvMasaPenghasilan2.text = masa.toString()

                    //hitung pbb

                    total_pbb = ((status_hitung * 0.15) / 12).toLong()
                    if (total_pbb <= 0) {
                        binding.tvTunggakan.visibility = View.VISIBLE
                        binding.tvTunggakan.text = "Anda Mempunya Tunggakan Pajak!"
                        binding.tvHasilPbb.text = total_pbb.toString()
                    } else {
                        binding.tvHasilPbb.text = total_pbb.toString()
                    }
                } else if (status == 1) {
                    val nilaiStat2: Long = 63000000
                    val status_hitung2 = total_penghasilan_kotor - nilaiStat2
                    binding.tvTotalPenghasilanBersih.text = status_hitung2.toString()
                    binding.tvTotalPenghasilanBersih2.text = status_hitung2.toString()
                    binding.tvMasaPenghasilan2.text = masa.toString()

                    //hitung pbb
                    total_pbb = ((status_hitung2 * 0.15) / 12).toLong()

                    if (total_pbb <= 0) {
                        binding.tvTunggakan.visibility = View.VISIBLE
                        binding.tvTunggakan.text = "Anda Mempunya Tunggakan Pajak!"
                        binding.tvHasilPbb.text = total_pbb.toString()
                    } else {
                        binding.tvHasilPbb.text = total_pbb.toString()
                    }
                } else if (status == 2) {
                    val nilaiStat3: Long = 67500000
                    val status_hitung3 = total_penghasilan_kotor - nilaiStat3
                    binding.tvTotalPenghasilanBersih.text = status_hitung3.toString()
                    binding.tvTotalPenghasilanBersih2.text = status_hitung3.toString()
                    binding.tvMasaPenghasilan2.text = masa.toString()

                    //hitung pbb
                    total_pbb = ((status_hitung3 * 0.15) / 12).toLong()
                    if (total_pbb <= 0) {
                        binding.tvTunggakan.visibility = View.VISIBLE
                        binding.tvTunggakan.text = "Anda Mempunya Tunggakan Pajak!"
                        binding.tvHasilPbb.text = total_pbb.toString()
                    } else {
                        binding.tvHasilPbb.text = total_pbb.toString()
                    }
                } else {
                    val nilaiStat4: Long = 72000000
                    val status_hitung4 = total_penghasilan_kotor - nilaiStat4
                    binding.tvTotalPenghasilanBersih.text = status_hitung4.toString()
                    binding.tvTotalPenghasilanBersih2.text = status_hitung4.toString()
                    binding.tvMasaPenghasilan2.text = masa.toString()

                    //hitung pbb
                    total_pbb = ((status_hitung4 * 0.15) / 12).toLong()
                    if (total_pbb <= 0) {
                        binding.tvTunggakan.visibility = View.VISIBLE
                        binding.tvTunggakan.text = "Anda Mempunya Tunggakan Pajak!"
                        binding.tvHasilPbb.text = total_pbb.toString()
                    } else {
                        binding.tvHasilPbb.text = total_pbb.toString()
                    }
                }
            }
            //hitung mas penghasilan 12 bulan
            else if (masa == 12) {
                //hitung gaji bersih 12 bulan
                if (status == 0) {
                    val nilaiStat1: Long = 54000000
                    val status_hitung = total_penghasilan_kotor - nilaiStat1
                    binding.tvTotalPenghasilanBersih.text = status_hitung.toString()
                    binding.tvTotalPenghasilanBersih2.text = status_hitung.toString()
                    binding.tvMasaPenghasilan2.text = masa.toString()

                    //hitung pbb
                    total_pbb = (status_hitung * 0.15).toLong()
                    if (total_pbb <= 0) {
                        binding.tvTunggakan.visibility = View.VISIBLE
                        binding.tvTunggakan.text = "Anda Mempunya Tunggakan Pajak!"
                        binding.tvHasilPbb.text = total_pbb.toString()
                    } else {
                        binding.tvHasilPbb.text = total_pbb.toString()
                    }
                } else if (status == 1) {
                    val nilaiStat2: Long = 63000000
                    val status_hitung2 = total_penghasilan_kotor - nilaiStat2
                    binding.tvTotalPenghasilanBersih.text = status_hitung2.toString()
                    binding.tvTotalPenghasilanBersih2.text = status_hitung2.toString()
                    binding.tvMasaPenghasilan2.text = masa.toString()
                    //hitung pbb
                    total_pbb = (status_hitung2 * 0.15).toLong()
                    if (total_pbb <= 0) {
                        binding.tvTunggakan.visibility = View.VISIBLE
                        binding.tvTunggakan.text = "Anda Mempunya Tunggakan Pajak!"
                        binding.tvHasilPbb.text = total_pbb.toString()
                    } else {
                        binding.tvHasilPbb.text = total_pbb.toString()
                    }
                } else if (status == 2) {
                    val nilaiStat3: Long = 67500000
                    val status_hitung3 = total_penghasilan_kotor - nilaiStat3
                    binding.tvTotalPenghasilanBersih.text = status_hitung3.toString()
                    binding.tvTotalPenghasilanBersih2.text = status_hitung3.toString()
                    binding.tvMasaPenghasilan2.text = masa.toString()
                    //hitung pbb
                    total_pbb = (status_hitung3 * 0.15).toLong()
                    if (total_pbb <= 0) {
                        binding.tvTunggakan.visibility = View.VISIBLE
                        binding.tvTunggakan.text = "Anda Mempunya Tunggakan Pajak!"
                        binding.tvHasilPbb.text = total_pbb.toString()
                    } else {
                        binding.tvHasilPbb.text = total_pbb.toString()
                    }

                } else {
                    val nilaiStat4: Long = 72000000
                    val status_hitung4 = total_penghasilan_kotor - nilaiStat4
                    binding.tvTotalPenghasilanBersih.text = status_hitung4.toString()
                    binding.tvTotalPenghasilanBersih2.text = status_hitung4.toString()
                    binding.tvMasaPenghasilan2.text = masa.toString()
                    //hitung pbb
                    total_pbb = (status_hitung4 * 0.15).toLong()
                    if (total_pbb <= 0) {
                        binding.tvTunggakan.visibility = View.VISIBLE
                        binding.tvTunggakan.text = "Anda Mempunya Tunggakan Pajak!"
                        binding.tvHasilPbb.text = total_pbb.toString()
                    } else {
                        binding.tvHasilPbb.text = total_pbb.toString()
                    }
                }
            } else {
                Toast.makeText(context, "Pilihan Anda Tidak Ditemukan", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        return inflater.inflate(R.menu.info_penghasilan_menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(
            item,
            view!!.findNavController()
        ) || super.onOptionsItemSelected(item)
    }
}
