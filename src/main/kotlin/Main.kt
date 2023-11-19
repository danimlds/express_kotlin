fun main() {
    //declaração e o corpo da função
    olaMundo()
    verificarIdade(20)
}
//body inline
fun olaMundo() = println("Ola Mundo!")

fun verificarIdade(age: Int) {
    if(age > 18) {
        println("Pode dirigir")
    }else {
        println("Não pode dirigir")
    }
}


