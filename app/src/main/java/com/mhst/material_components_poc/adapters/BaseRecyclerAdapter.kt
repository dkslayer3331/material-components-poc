package com.mhst.material_components_poc.adapters

import androidx.recyclerview.widget.RecyclerView
import com.mhst.material_components_poc.viewholders.BaseViewHolder

abstract class BaseRecyclerAdapter<T : BaseViewHolder<W>,W> : RecyclerView.Adapter<T>() {

    var mData : List<W> = mutableListOf()

    override fun getItemCount(): Int {
      return  mData.size
    }

    override fun onBindViewHolder(holder: T, position: Int) {
        holder.bindData(mData[position])
    }

    fun setNewData(list : MutableList<W>) {
        mData = list
        notifyDataSetChanged()
    }

}