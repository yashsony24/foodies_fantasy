package com.example.foodiesfantasy.Fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.foodiesfantasy.CongratsBottomSheet
import com.example.foodiesfantasy.PayOutActivity
import com.example.foodiesfantasy.R
import com.example.foodiesfantasy.adaptar.CartAdapter
import com.example.foodiesfantasy.databinding.FragmentCartBinding


class CartFragment : Fragment() {
    private lateinit var binding : FragmentCartBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCartBinding.inflate(inflater,container,false)


       val cartFoodName = listOf("Burger","Sandwich","Pizza","Momo","Pizza","Burger")
       val cartItemPrice = listOf("$5","$7","$8","$10","$8","$5")
       val cartImage = listOf(
           R.drawable.logomenu1,
           R.drawable.logomenu2,
           R.drawable.logomenu3,
           R.drawable.logomenu4,
           R.drawable.logomenu3,
           R.drawable.logomenu1,
       )
        val adapter = CartAdapter(ArrayList(cartFoodName),ArrayList(cartItemPrice),ArrayList(cartImage))
        binding.cartRecyclerView.layoutManager = LinearLayoutManager(requireContext())
        binding.cartRecyclerView.adapter = adapter
        binding.proceedButton.setOnClickListener{
            val intent = Intent(requireContext(),PayOutActivity::class.java)
            startActivity(intent)
        }

        return binding.root
    }

    companion object {

                }
            }
