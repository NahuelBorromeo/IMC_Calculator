package com.nahuelborromeo.androidmaster.imccalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.nahuelborromeo.androidmaster.R
import com.nahuelborromeo.androidmaster.imccalculator.ImcCalculatorActivity.Companion.IMC_KEY

class ResultIMCActivity : AppCompatActivity() {

    private lateinit var tvResult: TextView
    private lateinit var tvIMC: TextView
    private lateinit var tvDescription: TextView
    private lateinit var btnRecalculate: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_imcactivity)
        val result: Double = intent.extras?.getDouble(IMC_KEY) ?: -1.0
        initComponents()
        initUI(result)
        initListeners()

    }

    private fun initListeners() {
        btnRecalculate.setOnClickListener { onBackPressedDispatcher.onBackPressed() }
    }

    private fun initUI(result: Double) {
        tvIMC.text = result.toString()
        when(result){
            in 0.00 .. 18.50 -> { //Low weight
                tvResult.text = getString(R.string.title_low_weight)
                tvResult.setTextColor(ContextCompat.getColor(this,R.color.low_weight))
                tvDescription.text = getString(R.string.description_low_weight)
            }
            in 18.51 .. 24.99 -> { //Normal weight
                tvResult.text = getString(R.string.title_normal_weight)
                tvResult.setTextColor(ContextCompat.getColor(this,R.color.normal_weight))
                tvDescription.text = getString(R.string.description_normal_weight)
            }
            in 25.00 .. 29.99 -> { //OverWeight
                tvResult.text = getString(R.string.title_over_weight)
                tvResult.setTextColor(ContextCompat.getColor(this,R.color.over_weight))
                tvDescription.text = getString(R.string.description_over_weight)
            }
            in 30.00 .. 99.99 -> { //Obesity
                tvResult.text = getString(R.string.title_obesity)
                tvResult.setTextColor(ContextCompat.getColor(this,R.color.obesity))
                tvDescription.text = getString(R.string.description_obesity)
            }
            else -> { //error
                tvResult.text = getString(R.string.error)
                tvResult.setTextColor(ContextCompat.getColor(this,R.color.obesity))
                tvIMC.text = getString(R.string.error)
                tvDescription.text = getString(R.string.error)
            }

        }
    }

    private fun initComponents() {
        tvResult = findViewById(R.id.tvResult)
        tvIMC = findViewById(R.id.tvIMC)
        tvDescription = findViewById(R.id.tvDescription)
        btnRecalculate = findViewById(R.id.btnRecalculate)
    }
}