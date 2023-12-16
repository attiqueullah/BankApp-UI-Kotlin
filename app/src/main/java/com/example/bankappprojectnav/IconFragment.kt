package com.example.bankappprojectnav

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import android.widget.ImageView
import androidx.navigation.fragment.findNavController
import com.github.mikephil.charting.charts.BarChart
import com.github.mikephil.charting.data.BarData
import com.github.mikephil.charting.data.BarDataSet
import com.github.mikephil.charting.data.BarEntry
import com.github.mikephil.charting.utils.ColorTemplate

class IconFragment : Fragment() {



    private var bar: BarChart? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View?

    {
        // Inflate the layout for this fragment

        val view=inflater.inflate(R.layout.fragment_icon, container, false)
        val buttonOne = view.findViewById<ImageView>(R.id.next)
        buttonOne.setOnClickListener{
            findNavController().navigate(R.id.action_iconFragment_to_memberFragment)

            }

        bar = view.findViewById(R.id.barchart)

        // Add the provided code here
        val information = ArrayList<BarEntry>()
        information.add(BarEntry(2010f, 1000f))
        information.add(BarEntry(2011f, 1200f))
        information.add(BarEntry(2012f, 1400f))
        information.add(BarEntry(2013f, 1700f))
        information.add(BarEntry(2014f, 1300f))
        information.add(BarEntry(2015f, 1100f))
        information.add(BarEntry(2016f, 1000f))
        information.add(BarEntry(2017f, 1700f))
        information.add(BarEntry(2018f, 1900f))
        information.add(BarEntry(2019f, 2200f))

        val dataset = BarDataSet(information, "Report")
        dataset.setColors(*ColorTemplate.MATERIAL_COLORS)
        dataset.valueTextColor = Color.BLACK
        dataset.valueTextSize = 20f

        val barData = BarData(dataset)
        bar!!.setFitBars(true)
        bar!!.data = barData
        bar!!.description.text = "Bar Report Demo"
        bar!!.animateY(2000)

        return view
    }


}

