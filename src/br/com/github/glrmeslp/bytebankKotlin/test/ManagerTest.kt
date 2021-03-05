package br.com.github.glrmeslp.bytebankKotlin.test

import br.com.github.glrmeslp.bytebankKotlin.models.Manager
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class ManagerTest {

    lateinit var manager: Manager

    @Before
    fun setUp() {
        manager = Manager("Lucas","111.111.111-11",2000.0,"123")
    }

    @Test
    fun testBonus() {
        assertEquals("failure - The return of the Bonus is incorrect",2000.0,manager.bonus,0.0001)
    }

    @Test
    fun authenticates() {
        assertTrue("failure - returned false for authentication when password was true",manager.authenticates("123"))
    }

    @Test
    fun authenticatesWithWrongPassword() {
        assertFalse("failure - returned true for authentication when password was wrong",manager.authenticates("passwordWrong"))
    }
}