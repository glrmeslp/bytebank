package br.com.github.glrmeslp.bytebankKotlin

import br.com.github.glrmeslp.bytebankKotlin.models.Account
import br.com.github.glrmeslp.bytebankKotlin.models.Client
import br.com.github.glrmeslp.bytebankKotlin.models.CurrentAccount

fun main(args: Array<String>) {
    println("Welcome to Bytebank!")
    val clientAlex = Client("Alex", "111.111.111-11","123")
    val clientBia = Client("Bia", "222.222.222-22","123")
    val account = CurrentAccount(clientAlex, 1000)
    val account2 = CurrentAccount(clientBia, 1001)
    val account3 = CurrentAccount(clientBia, 1001)

    println(Account.total)

//    val total = account.
//
//    val account = Account("Alex", 1000)
//    account.deposit(150.0)
//    account.withdraw(50.0)
//    println(account.getOwner())
//    println(account.getAccountNumber())
//    println(account.getBalance())
//    println()
//
//    val accountBia = Account("Bia", 1001)
//    var transfer = account.transfer(accountBia, 50.0)
//    println(accountBia.getOwner())
//    println(accountBia.getAccountNumber())
//    println(accountBia.getBalance())
//
//    println()
//    println(account.getBalance())
//    println(transfer)
}