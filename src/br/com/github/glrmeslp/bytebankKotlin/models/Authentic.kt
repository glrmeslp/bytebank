package br.com.github.glrmeslp.bytebankKotlin.models

interface Authentic {
    fun authenticates(password: String) : Boolean

}