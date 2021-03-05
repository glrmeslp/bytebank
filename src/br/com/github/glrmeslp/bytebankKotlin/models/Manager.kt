package br.com.github.glrmeslp.bytebankKotlin.models

class Manager (
    name: String,
    cpf: String,
    wage: Double,
    private val password: String
) : Functionary(name,cpf,wage),
    Authentic {

    override val bonus : Double
        get() = this.wage


    override fun authenticates(password: String) : Boolean{
        if(this.password == password){
            return true
        }
        return false
    }
}