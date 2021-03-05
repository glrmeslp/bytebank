package br.com.github.glrmeslp.bytebankKotlin.models

abstract class Account(
    var owner: Client,
    val accountNumber: Int,
) {
    var balance = 0.0
        protected set

    companion object {
        var total = 0
            private set
    }

    init {
        total++
    }

    fun deposit(valor: Double) {
        this.balance += valor
    }

    abstract fun withdraw(valor: Double)


    fun transfer(account: Account, valor: Double): Boolean {
        if (balance >= valor) {
            this.withdraw(valor)
            account.deposit(valor)
            return true
        }
        return false
    }
}
