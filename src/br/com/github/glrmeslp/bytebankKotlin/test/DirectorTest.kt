package br.com.github.glrmeslp.bytebankKotlin.test

import br.com.github.glrmeslp.bytebankKotlin.models.Director
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class DirectorTest {

    lateinit var director: Director

    @Before
    fun setUp() {
        director = Director("Arthur","111.111.111-11",5000.0,"password",200.00)
    }

    @Test
    fun testBonus() {
        assertEquals("failure -  The return of Bonus is incorrect",5000.0 + 200.0,director.bonus,0.0001)
    }
}