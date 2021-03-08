package br.com.github.glrmeslp.bytebankKotlin.exceptions

class InsufficientBalanceException(
    message: String = "The balance is insufficient"
) : Exception(message)
