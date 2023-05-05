package com.example.e_commerce.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentActivity
import com.example.e_commerce.R
import com.example.e_commerce.adapter.CartAdapter
import com.example.e_commerce.databinding.FragmentCartBinding
import com.example.e_commerce.roomdb.AppDatabase
import androidx.lifecycle.observe
import androidx.lifecycle.lifecycleScope
import com.example.e_commerce.roomdb.ProductModel


class CartFragment : Fragment() {

    private lateinit var binding : FragmentCartBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentCartBinding.inflate(layoutInflater)

        val preference = requireContext().getSharedPreferences("info", AppCompatActivity.MODE_PRIVATE)
        val editor = preference.edit()
        editor.putBoolean("isCart", false)
        editor.apply()

        val dao = AppDatabase.getInstance(requireContext()).productDao()

        dao.getAllProducts().observe(requireActivity()){
            binding.cartRecycler.adapter = CartAdapter(requireContext(), it as List<ProductModel>)
        }

        return binding.root
    }


}

private fun <E> List<E>.observe(owner: FragmentActivity, onChanged: (Any?) -> E?) {
    TODO("Not yet implemented")
}
