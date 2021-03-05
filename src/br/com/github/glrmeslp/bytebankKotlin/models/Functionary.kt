package br.com.github.glrmeslp.bytebankKotlin.models

abstract class Functionary(
    val name: String,
    val cpf: String,
    wage: Double
) {
    var wage = wage
        private set
    abstract val bonus: Double
}