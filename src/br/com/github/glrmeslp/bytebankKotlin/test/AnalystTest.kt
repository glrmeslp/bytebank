package br.com.github.glrmeslp.bytebankKotlin.test

import br.com.github.glrmeslp.bytebankKotlin.models.Analyst
import org.junit.Before
import org.junit.Test

import org.junit.Assert.*

class AnalystTest {

    lateinit var analyst: Analyst

    @Before
    fun setUp() {
        analyst = Analyst("Maria","111.111.111-11",1800.0)
    }

    @Test
    fun getBonus() {
        val bonus = 1800.0 * 0.2
        assertEquals("failure - The return of bonus is incorrect",bonus,analyst.bonus,0.0001)
    }
}