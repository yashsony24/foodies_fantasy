package com.example.foodiesfantasy.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.interfaces.ItemClickListener
import com.denzcoskun.imageslider.models.SlideModel
import com.example.foodiesfantasy.R
import com.example.foodiesfantasy.R.drawable.*
import com.example.foodiesfantasy.adaptar.PopularAdapter
import com.example.foodiesfantasy.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        binding.viewAllMenu.setOnClickListener{
            val BottomSheetDialog = MenuBottomSheetFragment()
            BottomSheetDialog.show(parentFragmentManager,"Test")
        }
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val imageList = ArrayList<SlideModel>()
        imageList.add(SlideModel(logobanner_1, ScaleTypes.FIT))
        imageList.add(SlideModel(logobanner_2, ScaleTypes.FIT))
        imageList.add(SlideModel(logobanner_3, ScaleTypes.FIT))

        val imageSlider = binding.imageSlider
        imageSlider.setImageList(imageList)
        imageSlider.setImageList(imageList, ScaleTypes.FIT)
        imageSlider.setItemClickListener(object :ItemClickListener{
            override fun doubleClick(position: Int) {
            }

            override fun onItemSelected(position: Int) {
                val itemPostion = imageList[position]
                val itemMessage = "Selected Image $position"
                Toast.makeText(requireContext(),itemMessage,Toast.LENGTH_SHORT).show()

            }
        })
        val foodname = listOf("Burger", "Pizza", "Sandwich", "Momo")
        val Price = listOf("$5","$7","$8","$10")
        val popularFoodImages =
            listOf(R.drawable.logomenu1,R.drawable.logomenu2,R.drawable.logomenu3, R.drawable.logomenu4)
        val adapter: PopularAdapter = PopularAdapter(foodname,Price,popularFoodImages,requireContext())
        binding.PopularRecyclerView.layoutManager = LinearLayoutManager(requireContext())
        binding.PopularRecyclerView.adapter = adapter
    }
    companion object {

                }
            }
