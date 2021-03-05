package br.com.github.glrmeslp.bytebankKotlin.models

class CurrentAccount(
    owner: Client,
    accountNumber: Int
) : Account(owner, accountNumber) {

    override fun withdraw(value: Double) {
        val valueWithFee = value + 0.1
        if (balance >= valueWithFee) {
            this.balance -= valueWithFee
        }
      }

}