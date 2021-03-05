package br.com.github.glrmeslp.bytebankKotlin.test

import br.com.github.glrmeslp.bytebankKotlin.models.Client
import br.com.github.glrmeslp.bytebankKotlin.models.SavingsAccount
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class SavingsAccountTest {

    lateinit var savingsAccount: SavingsAccount
    lateinit var client: Client

    @Before
    fun setUp() {
        client = Client("Bia","111.111.111-11","123")
        savingsAccount = SavingsAccount(client,1000)
    }

    @Test
    fun withdraw() {
        savingsAccount.deposit(100.0)
        savingsAccount.withdraw(50.0)

        assertEquals("failure - Balance is incorrect", 50.0,savingsAccount.balance,0.001)
    }

    @Test
    fun withdrawWithValueLessThanBalance() {
        savingsAccount.deposit(100.0)
        savingsAccount.withdraw(101.0)
        assertEquals("failure - doubles are not equal",100.0,savingsAccount.balance,0.00001)
    }

    @Test
    fun withdrawWithValueEqualThanBalance() {
        savingsAccount.deposit(100.0)
        savingsAccount.withdraw(100.0)
        assertEquals("failure - doubles are not equal",0.0,savingsAccount.balance,0.00001)
    }
}