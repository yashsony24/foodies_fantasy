package com.example.foodiesfantasy.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.foodiesfantasy.R
import com.example.foodiesfantasy.adaptar.MenuAdapter
import com.example.foodiesfantasy.databinding.FragmentSearchBinding

class SearchFragment : Fragment() {
    private lateinit var binding: FragmentSearchBinding
    private lateinit var adapter: MenuAdapter
    private val originalMenuFoodName = listOf(
        "Burger",
        "Sandwich",
        "Pizza",
        "Momo",
        "Pizza",
        "Burger",
        "Sandwich",
        "Pizza",
        "Momo",
        "Pizza",
        "Burger")
    private val originalMenuItemPrice = listOf("$5","$7","$8","$10","$8","$5","$7","$8","$10","$8","$5")
    private val originalMenuImage = listOf(
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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
private val filteredMenuFoodName = mutableListOf<String>()
private val filteredMenuItemPrice = mutableListOf<String>()
private val filteredMenuImage = mutableListOf<Int>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSearchBinding.inflate(inflater,container,false)
        adapter = MenuAdapter(filteredMenuFoodName,filteredMenuItemPrice,filteredMenuImage,requireContext())
        binding.menuRecyclerView.layoutManager = LinearLayoutManager(requireContext())
        binding.menuRecyclerView.adapter = adapter

        //setup for search view
        setupSearchView()
        //show All menu Items
        showAllMenu()
        return binding.root
    }

    private fun showAllMenu() {
        filteredMenuFoodName.clear()
        filteredMenuItemPrice.clear()
        filteredMenuImage.clear()

        filteredMenuFoodName.addAll(originalMenuFoodName)
        filteredMenuItemPrice.addAll(originalMenuItemPrice)
        filteredMenuImage.addAll(originalMenuImage)

        adapter.notifyDataSetChanged()
    }

    private fun setupSearchView() {
        binding.searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(query: String): Boolean {
                filterMenuItem(query)
                return true
            }

            override fun onQueryTextChange(newText: String): Boolean {
                filterMenuItem(newText)
                return true
            }
        })
    }

    private fun filterMenuItem(query: String) {
        filteredMenuFoodName.clear()
        filteredMenuItemPrice.clear()
        filteredMenuImage.clear()

        originalMenuFoodName.forEachIndexed{index,foodName ->
            if(foodName.contains(query,ignoreCase = true))
                filteredMenuFoodName.add(foodName)
            filteredMenuItemPrice.add(originalMenuItemPrice[index])
            filteredMenuImage.add(originalMenuImage[index])
        }
        adapter.notifyDataSetChanged()
    }

    companion object {

    }
}

private fun androidx.appcompat.widget.SearchView.setOnQueryTextListener(onQueryTextListener: SearchView.OnQueryTextListener) {
}
