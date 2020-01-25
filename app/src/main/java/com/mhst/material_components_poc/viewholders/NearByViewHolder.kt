package com.mhst.material_components_poc.viewholders

import android.view.View
import com.mhst.material_components_poc.models.NearByVO
import kotlinx.android.synthetic.main.rv_item.view.*

class NearByViewHolder(itemView: View) : BaseViewHolder<NearByVO>(itemView) {
    override fun bindData(data: NearByVO) {
        itemView.tvPlaceName.text = data.name
        itemView.tvLocationName.text = data.location
        itemView.tvDiscount.text = data.discount
    }
}