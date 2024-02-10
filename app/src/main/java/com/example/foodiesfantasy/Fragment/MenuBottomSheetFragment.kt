package com.example.foodiesfantasy.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.foodiesfantasy.R
import com.example.foodiesfantasy.adaptar.MenuAdapter
import com.example.foodiesfantasy.databinding.FragmentMenuBottomSheetBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class MenuBottomSheetFragment : BottomSheetDialogFragment() {
    private lateinit var binding: FragmentMenuBottomSheetBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMenuBottomSheetBinding.inflate(inflater,container,false)


        binding.buttonBack.setOnClickListener{
            dismiss()
        }

        val menuFoodName = listOf("Burger","Sandwich","Pizza","Momo","Pizza","Burger","Sandwich","Pizza","Momo","Pizza","Burger")
        val menuItemPrice = listOf("$5","$7","$8","$10","$8","$5","$7","$8","$10","$8","$5")
        val menuImage = listOf(
            R.drawable.logomenu1,
            R.drawable.logomenu2,
            R.drawable.logomenu3,
            R.drawable.logomenu4,
            R.drawable.logomenu3,
            R.drawable.logomenu1,
            R.drawable.logomenu2,
            R.drawable.logomenu3,
            R.drawable.logomenu4,
            R.drawable.logomenu3,
            R.drawable.logomenu1,
        )
        val adapter = MenuAdapter(
            ArrayList(menuFoodName),
            ArrayList(menuItemPrice),
            ArrayList(menuImage),requireContext()
        )

        binding.menuRecyclerView.layoutManager = LinearLayoutManager(requireContext())
        binding.menuRecyclerView.adapter = adapter
        return binding.root
    }


    companion object {

    }
}