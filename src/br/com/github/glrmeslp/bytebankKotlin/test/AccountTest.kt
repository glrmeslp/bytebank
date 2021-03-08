package br.com.github.glrmeslp.bytebankKotlin.test
import br.com.github.glrmeslp.bytebankKotlin.exceptions.*
import br.com.github.glrmeslp.bytebankKotlin.models.*
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test


class AccountTest {

    lateinit var account: CurrentAccount
    lateinit var accountToTransfer: CurrentAccount
    lateinit var clientAlex: Client
    lateinit var clientBia: Client

    @Before
    fun setUp() {
        clientAlex = Client("Alex", "111.111.111-11","123")
        clientBia = Client("Bia", "222.222.222-22","123")
        account = CurrentAccount(clientAlex, 1000)
        accountToTransfer = CurrentAccount(clientBia, 1001)
    }

    @Test
    fun deposit() {
        account.deposit(100.0)
        assertEquals("failure - doubles are not equal",100.0,account.balance,0.00001)
    }

    @Test
    fun transfer() {
        account.deposit(100.0)
        account.transfer(accountToTransfer,20.0,"123")
        assertEquals("failure - doubles are not equal",79.9,account.balance,0.00001)
        assertEquals("failure - doubles are not equal",20.0,accountToTransfer.balance,0.00001)
    }

    @Test(expected = InsufficientBalanceException::class)
    fun transferWithValueLessThanBalance() {
        account.deposit(100.0)
        account.transfer(accountToTransfer, 101.0, "123")
        assertEquals("failure - doubles are not equal",100.0,account.balance,0.00001)
        assertEquals("failure - doubles are not equal",0.0,accountToTransfer.balance,0.00001)
    }

    @Test(expected = AuthenticationFailureException::class)
    fun transferWithWrongPassword() {
        account.deposit(100.1)
        account.transfer(accountToTransfer,100.0,"1234")
        assertEquals("failure - doubles are not equal",0.0,account.balance,0.00001)
        assertEquals("failure - doubles are not equal",100.0,accountToTransfer.balance,0.00001)
    }

    @Test
    fun getBalance() {
        account.deposit(100.0)
        assertEquals("failure - doubles are not equal",100.0,account.balance,0.00001)
    }

    @Test
    fun getAccountNumber() {
        assertEquals("failure - The return of AccountNumber is incorrect",1000,account.accountNumber)
    }

    @Test
    fun getOwner() {
        assertEquals("failure - The return of name is incorrect","Alex",account.owner.name)
        assertEquals("failure - The return of CPF is incorrect","111.111.111-11",account.owner.cpf)
    }

    @Test
    fun totalAccount() {
        assertEquals("failure - Total Account is incorrect", 2,Account.total)
    }
}