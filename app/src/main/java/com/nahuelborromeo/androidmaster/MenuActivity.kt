package com.nahuelborromeo.androidmaster

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.nahuelborromeo.androidmaster.firstapp.FirstAppActivity
import com.nahuelborromeo.androidmaster.imccalculator.ImcCalculatorActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        val btnHelloApp = findViewById<Button>(R.id.btnHelloApp)
        val btnIMCApp = findViewById<Button>(R.id.btnIMCApp)

        btnHelloApp.setOnClickListener { navigateToHelloApp() }

        btnIMCApp.setOnClickListener { navigateToIMCApp() }

    }

    private fun navigateToIMCApp() {
        val intent = Intent(this, ImcCalculatorActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToHelloApp() {
        val intent = Intent(this, FirstAppActivity::class.java)
        startActivity(intent)
    }
}