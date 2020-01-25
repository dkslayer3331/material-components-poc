package com.mhst.material_components_poc.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import com.mhst.material_components_poc.R
import com.mhst.material_components_poc.models.NearByVO
import com.mhst.material_components_poc.viewholders.NearByViewHolder

class NearByRecyclerAdapter : BaseRecyclerAdapter<NearByViewHolder,NearByVO>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NearByViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.rv_item,parent,false)
        return NearByViewHolder(view)
    }

}