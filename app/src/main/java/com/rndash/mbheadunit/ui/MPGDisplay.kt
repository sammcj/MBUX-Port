package com.rndash.mbheadunit.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.rndash.mbheadunit.R
import com.rndash.mbheadunit.canData.CanBusC
import java.util.*

@ExperimentalUnsignedTypes
class MPGDisplay : Fragment() {
    lateinit var mpg_text: TextView
    lateinit var avg_mpg_text: TextView
    lateinit var tank_mpg: TextView
    lateinit var fuel_usage: TextView
    lateinit var fuel_consumed_curr: TextView
    var isInPage = false
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.mpg_display, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        isInPage = true
        super.onViewCreated(view, savedInstanceState)
        mpg_text = view.findViewById(R.id.text_mpg)
        avg_mpg_text = view.findViewById(R.id.text_avg_mpg)
        tank_mpg = view.findViewById(R.id.text_reset_mpg)
        fuel_usage = view.findViewById(R.id.text_consumed_journey)
        fuel_consumed_curr = view.findViewById(R.id.text_consumed_curr)

        Timer().schedule(object: TimerTask() {
            override fun run() {
                if (!isInPage){return}
                val consumedLitres = CanBusC.getFuelConsumedTotal() / 1000000.0 //ul  to L
                val consumed_curr = CanBusC.getFuelConsumptionCurr()
                activity?.runOnUiThread {
                    if(CanBusC.isEngineOn()) {
                        fuel_consumed_curr.text = String.format("Fuel usage: %4d ul/s", consumed_curr)
                        fuel_usage.text = String.format("Fuel used: %2.2f L", consumedLitres)
                        mpg_text.text = String.format("Usage: %02.2f L/h", (consumed_curr * 3600) / 1000000.0)
                    } else {
                        fuel_consumed_curr.text = "Fuel usage: __ ul/s"
                        mpg_text.text = "Engine off"
                    }
                }
            }
        }, 0, 500)
    }

    override fun onPause() {
        super.onPause()
        isInPage = false
    }

    override fun onResume() {
        super.onResume()
        isInPage = true
    }
}