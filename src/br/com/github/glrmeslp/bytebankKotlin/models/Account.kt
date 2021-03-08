package br.com.github.glrmeslp.bytebankKotlin.models

import br.com.github.glrmeslp.bytebankKotlin.exceptions.AuthenticationFailureException
import br.com.github.glrmeslp.bytebankKotlin.exceptions.InsufficientBalanceException

abstract class Account(
    var owner: Client,
    val accountNumber: Int,
) : Authentic by owner {
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


    fun transfer(account: Account, value: Double, password: String) {
        if (balance < value) {
            throw InsufficientBalanceException(
                "The balance is insufficient. Current balance: $balance. Transfer value: $value"
            )
        }
        if (!authenticates(password)){
            throw AuthenticationFailureException()
        }
        this.withdraw(value)
        account.deposit(value)

    }
}
