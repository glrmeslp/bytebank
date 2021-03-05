package br.com.github.glrmeslp.bytebankKotlin.models

class Analyst (
    name: String,
    cpf: String,
    wage: Double
) : Functionary(name,cpf,wage) {

    override val bonus : Double
        get() = this.wage * 0.2

}