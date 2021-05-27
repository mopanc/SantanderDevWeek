package com.mopanc.santanderdevweek

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))

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

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflate = menuInflater
        inflate.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.item_1 -> {
                Log.d("CLICK", "Click no item 1")
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}