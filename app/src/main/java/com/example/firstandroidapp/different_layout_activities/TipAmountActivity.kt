package com.example.firstandroidapp.different_layout_activities

import android.os.Bundle
import android.widget.RadioGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import androidx.appcompat.widget.SwitchCompat
import com.example.firstandroidapp.R
import kotlin.math.ceil

class TipAmountActivity : AppCompatActivity() {
    private lateinit var etCostOfService: AppCompatEditText
    private lateinit var rgServiceOptions: RadioGroup
    private lateinit var roundUpTipSwitch: SwitchCompat
    private lateinit var btnCalculateTip: AppCompatButton
    private lateinit var tvTipAmount: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tip_amount)
        findViews()
        onButtonClicked()
    }

    private fun onButtonClicked() {
        btnCalculateTip.setOnClickListener {
            val costOfServiceValue = etCostOfService.text.toString().toDoubleOrNull()
            var result: Double = 0.0

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

    private fun findViews() {
        etCostOfService = findViewById(R.id.etCostOfService)
        rgServiceOptions = findViewById(R.id.rgServiceOptions)
        roundUpTipSwitch = findViewById(R.id.scRoundUpTip)
        btnCalculateTip = findViewById(R.id.btnCalculate)
        tvTipAmount = findViewById(R.id.tvTipAmount)
    }
}