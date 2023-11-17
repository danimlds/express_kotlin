fun main() {
    val number: Long = 3_000_000_000
    println(number)

    //operadores lógicos + - / * boolean(!)
    //criptografia
    //char

    val name = "Daniel Moura"
    print(name.length)
    print("\n")
    print(name.uppercase())


    val message = "Olá Daniel,\n seu produto chegou!"
    println(message)

    val welcome = """
        prod1,
        numero1!
        """.replaceIndent(";")
    println(welcome)

    val nome = "Daniel Moura"
    //val age = 31
    //println("Olá, " + nome + ", sua idade é: " +age)

    //println("Olá, $nome, sua idade é: ${age + 10} ")

    val codiName = "Daniel Moura"
    val age = 31
    println("Olá, ${codiName} com número de caracteres igual a ${codiName.length}, sua idade é: ${age + 10} ")

    //CONDIÇÕES LÓGICAS

    // E
    // TRUE | TRUE = true
    // TRUE | FALSE = false
    // FALSE | TRUE = false
    // FALSE | FALSE = false

    // OU
    // nunca verifica a próxima instrução
    // TRUE | TRUE = true
    // TRUE | FALSE = true
    // FALSE | TRUE = true
    // FALSE | FALSE = false

    val produto = "Iphone"
    val preco = 49

    if(preco == 49 || produto == "Iphone") {
        println("sucesso!")
    }else {
        println("false!")
    }
    }
