package com.mopanc.santanderdevweek

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // declarndo variaveis
        // val = constante
        // var = mutável

        // segurança nula
        //val languageName: String? = null

        // condicionais
        //    var idade = 20
        //
        //    val minhaIdade : String = if (idade > 18) {
        //        "Voce é maior de idade"
        //    } else {
        //        "voce é menor de idade"
        //    }

        //when
        //val minhaIdade = when {
        //    idade > 18 -> "Você é maior de idade"
        //    else -> "você é menor de idade"
        //}

        //fun minhaIdade() : String {
        //    return "minha idade é 18"
        //}


    }
}