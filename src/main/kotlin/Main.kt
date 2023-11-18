fun main() {
    test()
}

//function dentro de outra function
fun test() {
    println("test")

    //funcões de escopo (RARO de usar)
    fun sub() {
        println(2 - 1)
    }
        sub()

    //fazer várias coisas (login, registro no banco)

        sub()
}

