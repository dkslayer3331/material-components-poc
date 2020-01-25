package com.mhst.material_components_poc.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import com.mhst.material_components_poc.R
import com.mhst.material_components_poc.models.TopSearchVO
import com.mhst.material_components_poc.viewholders.TopSearchViewHolder

class TopSearchRecyclerAdapter : BaseRecyclerAdapter<TopSearchViewHolder, TopSearchVO>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TopSearchViewHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.rv_top_search_item,parent,false)
        return TopSearchViewHolder(view)
    }
}