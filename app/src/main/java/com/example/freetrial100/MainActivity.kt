package com.example.freetrial100

import android.app.Activity
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import java.util.concurrent.TimeUnit

class MainActivity : Activity() {
    private val prefs by lazy { getSharedPreferences("trial_prefs", MODE_PRIVATE) }
    private val duration = TimeUnit.DAYS.toMillis(100)
    private lateinit var status: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (!prefs.contains(KEY_START)) {
            prefs.edit().putLong(KEY_START, System.currentTimeMillis()).apply()
        }

        val layout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER
            setPadding(32, 32, 32, 32)
        }
        val title = TextView(this).apply {
            text = "FreeTrial100"
            textSize = 28f
            gravity = Gravity.CENTER
        }
        status = TextView(this).apply {
            textSize = 20f
            gravity = Gravity.CENTER
            setPadding(0, 28, 0, 28)
        }
        val refresh = Button(this).apply {
            text = "Actualizar"
            setOnClickListener { updateStatus() }
        }
        layout.addView(title)
        layout.addView(status)
        layout.addView(refresh)
        setContentView(layout)
        updateStatus()
    }

    private fun updateStatus() {
        val start = prefs.getLong(KEY_START, 0L)
        val elapsed = (System.currentTimeMillis() - start).coerceAtLeast(0L)
        val remaining = (duration - elapsed).coerceAtLeast(0L)
        status.text = if (remaining > 0L) {
            val dayMs = TimeUnit.DAYS.toMillis(1)
            val days = (remaining + dayMs - 1) / dayMs
            "Prueba gratuita activa\nTe quedan $days días."
        } else {
            "Tu periodo de prueba de 100 días ha finalizado."
        }
    }

    companion object { private const val KEY_START = "trial_start_time" }
}
