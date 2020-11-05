package com.activityintentsharedpreferences

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun navegar(view: View) {
        val primeiroNome = primeiroNome.text.toString()
        val segundoNome = segundoNome.text.toString()
        val intent = Intent(this, MainActivity2::class.java)
        intent.putExtra("primeiroNome", primeiroNome)

        val sp = getSharedPreferences("salvaSegundoNome", 0)
        val editor = sp.edit()
        editor.putString("segundoNome", segundoNome)
        editor.apply()

        startActivity(intent)
    }
}