package com.activityintentsharedpreferences

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val intent = intent
        val val1 = intent.getStringExtra("primeiroNome")
        primeiroNome.text = val1;

        val sp = getSharedPreferences("salvaSegundoNome", 0)
        val val2 = sp.getString("segundoNome", null)
        segundoNome.text = val2;
    }
}