package br.com.github.glrmeslp.bytebankKotlin.test

import br.com.github.glrmeslp.bytebankKotlin.models.Client
import br.com.github.glrmeslp.bytebankKotlin.models.CurrentAccount
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class CurrentAccountTest {

    lateinit var currentAccount: CurrentAccount
    lateinit var client: Client

    @Before
    fun setUp() {
        client = Client("Bill","111.111.111-11","123")
        currentAccount = CurrentAccount(client,1000)
    }

    @Test
    fun withdraw() {
        val valueWithFee = 100 - (50 + 0.1)
        currentAccount.deposit(100.0)
        currentAccount.withdraw(50.0)
        assertEquals("failure - Return of balance is incorrect",valueWithFee,currentAccount.balance,0.001)

    }

    @Test
    fun withdrawWithValueLessThanBalance() {
        currentAccount.deposit(100.0)
        currentAccount.withdraw(100.0)
        assertEquals("failure - doubles are not equal",100.0,currentAccount.balance,0.00001)
    }

    @Test
    fun withdrawWithValueWithFeeEqualThanBalance() {
        currentAccount.deposit(100.1)
        currentAccount.withdraw(100.0)
        assertEquals("failure - doubles are not equal",0.0,currentAccount.balance,0.00001)
    }
}