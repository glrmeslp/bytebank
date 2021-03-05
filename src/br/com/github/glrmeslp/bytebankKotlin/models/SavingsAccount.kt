package br.com.github.glrmeslp.bytebankKotlin.models

class SavingsAccount(
    owner: Client,
    accountNumber: Int
) : Account(owner, accountNumber) {
    override fun withdraw(valor: Double) {
        if (balance >= valor) this.balance -= valor
    }
}