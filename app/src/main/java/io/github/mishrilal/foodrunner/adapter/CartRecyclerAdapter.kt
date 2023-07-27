package io.github.mishrilal.foodrunner.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import io.github.mishrilal.foodrunner.R
import io.github.mishrilal.foodrunner.model.RestaurantsDetails


class CartRecyclerAdapter(
    private val cartArray: ArrayList<RestaurantsDetails>,
    val context: Context
) : RecyclerView.Adapter<CartRecyclerAdapter.CartViewHolder>() {

    class CartViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val txtDishName: TextView = view.findViewById(R.id.txtDishName)
        val txtCost: TextView = view.findViewById(R.id.txtCost)
    }

    override fun getItemViewType(position: Int): Int {
        return position
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CartViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.recycler_cart_single_row, parent, false)
        return CartViewHolder(view)
    }

    override fun getItemCount(): Int {
        return cartArray.size
    }

    override fun onBindViewHolder(holder: CartViewHolder, position: Int) {
        val cartObj = cartArray[position]
        holder.txtDishName.text = cartObj.dishName
        val price = "\u20B9 ${cartObj.dishPrice}"
        holder.txtCost.text = price
    }

}