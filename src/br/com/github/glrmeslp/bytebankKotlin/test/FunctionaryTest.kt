package br.com.github.glrmeslp.bytebankKotlin.test

import br.com.github.glrmeslp.bytebankKotlin.models.Analyst
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class FunctionaryTest {
    lateinit var functionary: Analyst

    @Before
    fun setUp() {
        functionary = Analyst("Diego","03178520222", 1250.0)
    }

    @Test
    fun getName() {
        assertEquals("failure - The return of Name is incorrect","Diego",functionary.name)
    }

    @Test
    fun getCpf() {
        assertEquals("failure - The return of CPF is incorrect","03178520222",functionary.cpf)
    }
}