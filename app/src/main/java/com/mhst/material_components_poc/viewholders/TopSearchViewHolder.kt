package com.mhst.material_components_poc.viewholders

import android.view.View
import com.mhst.material_components_poc.models.TopSearchVO
import kotlinx.android.synthetic.main.rv_top_search_item.view.*

class TopSearchViewHolder(itemView: View) : BaseViewHolder<TopSearchVO>(itemView) {
    override fun bindData(data: TopSearchVO) {
        itemView.mTvHotelName.text = data.name
        itemView.mTvHotelPlace.text = data.location
    }
}