package com.bitcoinwallet.fragments

import android.support.v4.app.DialogFragment
import android.widget.NumberPicker

abstract class ThreePickerDialog : DialogFragment() {

    protected fun setupPicker(
        picker: NumberPicker,
        values: Array<String>,
        onChange: ((NumberPicker, Int, Int) -> Unit)
    ) {
        picker.minValue = 0
        picker.maxValue = values.size - 1
        picker.wrapSelectorWheel = true
        picker.displayedValues = values
        picker.setOnValueChangedListener(onChange)
    }

    protected fun createPickerRanges(from: Int = 0, to: Int): Array<String> {
        val lst =  mutableListOf<String>()

        for (i in from..to) {
            if (i < 10) {
                val s = i.toString()
                val tmp = "0$s"
                lst.add(tmp)
            } else {
                lst.add(i.toString())
            }
        }

        return lst.toTypedArray()
    }
}