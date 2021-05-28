package com.mopanc.santanderdevweek.data.local

import com.mopanc.santanderdevweek.data.Conta
import com.mopanc.santanderdevweek.data.Cartao
import com.mopanc.santanderdevweek.data.Cliente

class FakeData {
    fun getLocalData() : Conta {
        val cliente = Cliente("Jorge Morais")
        val cartao = Cartao("4524255552")
        return Conta(
            "445655-4",
            "6552-4",
            "R$ 2.345,50",
            "R$ 5.670,00",
            cliente,
            cartao
        );
    }
}