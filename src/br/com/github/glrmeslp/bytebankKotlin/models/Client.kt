package br.com.github.glrmeslp.bytebankKotlin.models

class Client (
    val name: String,
    val cpf: String,
    private val password: String,
    var address: Address = Address()
) : Authentic {

    override fun authenticates(password: String): Boolean {
        if(this.password == password){
            return true
        }
        return false
    }

}