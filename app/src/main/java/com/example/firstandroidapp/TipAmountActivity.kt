package com.example.firstandroidapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioGroup
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import androidx.appcompat.widget.SwitchCompat
import kotlin.math.ceil

class TipAmountActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tip_amount)
        val etCostOfService : AppCompatEditText = findViewById(R.id.etCostOfService)
        val rgServiceOptions : RadioGroup = findViewById(R.id.rgServiceOptions)
        val roundUpTipSwitch : SwitchCompat = findViewById(R.id.scRoundUpTip)
        val btnCalculateTip : AppCompatButton = findViewById(R.id.btnCalculate)
        val tvTipAmount : TextView = findViewById(R.id.tvTipAmount)

        btnCalculateTip.setOnClickListener {
            val costOfServiceValue = etCostOfService.text.toString().toDoubleOrNull()
            var result : Double = 0.0

            result = when (rgServiceOptions.checkedRadioButtonId) {
                R.id.rbAmazing -> {
                    costOfServiceValue!! * 0.20
                }

                R.id.rbGood -> {
                    costOfServiceValue!! * 0.18
                }

                R.id.rbOkay -> {
                    costOfServiceValue!! * 0.15
                }

                else -> {
                    costOfServiceValue!!
                }
            }

            if (roundUpTipSwitch.isChecked) {
                tvTipAmount.text = "Tip amount is : ${ceil(result)}"
            } else {
                tvTipAmount.text = "Tim amount is $result"
            }

        }

    }
}