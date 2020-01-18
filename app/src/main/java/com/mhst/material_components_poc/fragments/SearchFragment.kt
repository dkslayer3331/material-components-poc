package com.mhst.material_components_poc.fragments


import android.app.DatePickerDialog
import android.icu.util.LocaleData
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.list.rados.fast_list.bind

import com.mhst.material_components_poc.R
import kotlinx.android.synthetic.main.fragment_search.*
import kotlinx.android.synthetic.main.fragment_search.view.*
import kotlinx.android.synthetic.main.rv_top_search_item.view.*
import java.sql.Date
import java.text.SimpleDateFormat
import java.util.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [SearchFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SearchFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

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
        return inflater.inflate(R.layout.fragment_search, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        view.rvTopSearchPlaces.bind(listOf("Yangon","Bagan","Bha An"),R.layout.rv_top_search_item){cityName ->
            mTvHotelName.text = cityName
        }.layoutManager(LinearLayoutManager(context).apply {
            orientation = LinearLayoutManager.HORIZONTAL
        })

        chip4.setOnClickListener {
            val dialog = BottomSheetFragment()
            dialog.show(childFragmentManager,"geg")
        }

        val formatter = SimpleDateFormat("dd MMMM")

        val calendar = Calendar.getInstance()

        val day = calendar.get(Calendar.DAY_OF_MONTH)
        val month = calendar.get(Calendar.MONTH)
        val year = calendar.get(Calendar.YEAR)

        view.etCheckIn.setOnClickListener {

            print("gege")

            val dialog = DatePickerDialog(context!!,
                DatePickerDialog.OnDateSetListener {
                        view, y, m, d ->
                    val dateInText = formatter.format(Date(y,m,d))
                    etCheckIn.setText("$dateInText $y")
                },year,month,day)

            dialog.show()
        }

        view.etCheckOut.setOnClickListener {
            val dialog = DatePickerDialog(context!!,
                DatePickerDialog.OnDateSetListener {
                        view, y, m, d ->
                    val dateInText = formatter.format(Date(y,m,d))
                    etCheckOut.setText("$dateInText, $y")
                },year,month,day)

            dialog.show()
        }

    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment SearchFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            SearchFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}
