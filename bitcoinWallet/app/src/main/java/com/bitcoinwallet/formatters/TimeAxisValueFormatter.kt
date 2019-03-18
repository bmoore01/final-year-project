package com.bitcoinwallet.formatters

import com.bitcoinwallet.utilities.DateTimeUtilities
import com.github.mikephil.charting.components.AxisBase
import com.github.mikephil.charting.formatter.IAxisValueFormatter

/**
 * Created by Ben Moore on 18/03/2019.
 */

class TimeAxisValueFormatter(private val  referenceTimestamp: Long) : IAxisValueFormatter {
    override fun getFormattedValue(value: Float, axis: AxisBase?): String {
        val convertedTimestamp =  value.toLong()

        val originalTimestamp = referenceTimestamp + convertedTimestamp

        return DateTimeUtilities.epochTimeToTime(originalTimestamp)
    }
}