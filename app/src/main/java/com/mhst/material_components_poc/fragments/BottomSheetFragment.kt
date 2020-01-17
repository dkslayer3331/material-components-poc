package com.mhst.material_components_poc.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.mhst.material_components_poc.R
import kotlinx.android.synthetic.main.bottom_sheet_layout.view.*

class BottomSheetFragment : BottomSheetDialogFragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.bottom_sheet_layout,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        view.btnCancel.setOnClickListener {
            dialog?.hide()
        }
        super.onViewCreated(view, savedInstanceState)
    }
}