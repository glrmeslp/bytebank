package br.com.github.glrmeslp.bytebankKotlin.models

class Director (
    name: String,
    cpf: String,
    wage: Double,
    private val password: String,
    val plr: Double
) : Functionary(name,cpf,wage),
    Authentic {

    override val bonus : Double
        get() = this.wage + this.plr

    override fun authenticates(password: String) : Boolean{
        if(this.password == password){
            return true
        }
        return false
    }
}