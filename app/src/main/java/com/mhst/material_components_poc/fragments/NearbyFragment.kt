package com.mhst.material_components_poc.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.list.rados.fast_list.bind

import com.mhst.material_components_poc.R
import com.mhst.material_components_poc.adapters.BaseRecyclerAdapter
import com.mhst.material_components_poc.adapters.NearByRecyclerAdapter
import com.mhst.material_components_poc.models.NearByVO
import kotlinx.android.synthetic.main.fragment_nearby.*
import kotlinx.android.synthetic.main.rv_item.view.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [NearbyFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class NearbyFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    lateinit var adapter : NearByRecyclerAdapter

    val dummyData = mutableListOf<NearByVO>(
        NearByVO("Yangon","Yangon, Myanamr","15% discount"),
        NearByVO("Mandalay","Mandalay, Myanamr","25% discount"),
        NearByVO("Pathein","Pathein, Myanamr","35% discount")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_nearby, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        rvNearByPlaces.bind(listOf("Mandalay","Yangon","NayPyiTaw","MawLaMyaing"),R.layout.rv_item){ cityName ->
//            tvPlaceName.text = cityName
//        }
        adapter = NearByRecyclerAdapter()

        adapter.setNewData(dummyData)

        rvNearByPlaces.layoutManager = LinearLayoutManager(context).apply {
            orientation = LinearLayoutManager.VERTICAL
        }

        rvNearByPlaces.adapter = adapter

    }


    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment NearbyFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            NearbyFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}
