package br.com.github.glrmeslp.bytebankKotlin.test

import br.com.github.glrmeslp.bytebankKotlin.models.*
import org.junit.Before
import org.junit.Test

import org.junit.Assert.*

class BonusCalculatorTest {

    lateinit var bonusCalculator: BonusCalculator
//    lateinit var functionary: Functionary
    lateinit var manager: Manager
    lateinit var director: Director

    @Before
    fun setUp() {
//        functionary = Functionary("ALex","111.111.111-11",1000.0)
        manager = Manager("Diogo", "222.222.222-22",2500.0,"123")
        director = Director("Bia", "333.333.333-33",5000.0,"123456",200.0)
        bonusCalculator = BonusCalculator()
    }

    @Test
    fun getTotal() {
        assertEquals("failure - The return is incorrect",0.0,bonusCalculator.total,0.0001)
    }

//    @Test
//    fun registerOneFunctionary() {
//        val total = functionary.bonus
//        bonusCalculator.register(functionary)
//        assertEquals("failure - The total is incorrect",total,bonusCalculator.total,0.0001)
//    }
    @Test
    fun registerOneManager() {
        val total = manager.bonus
        bonusCalculator.register(manager)
        assertEquals("failure - The total is incorrect", total, bonusCalculator.total, 0.0001)
    }
    @Test
    fun registerOneDirector() {
        val total = director.bonus
        bonusCalculator.register(director)
        assertEquals("failure - The total is incorrect", total, bonusCalculator.total, 0.0001)
    }
    @Test
    fun registerManyFunctionary() {
        val total =  manager.bonus + director.bonus
        bonusCalculator.register(manager)
        bonusCalculator.register(director)
        assertEquals("failure - The total is incorrect", total, bonusCalculator.total, 0.0001)
    }
}