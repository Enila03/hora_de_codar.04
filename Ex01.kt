fun main() {
    
    var names: String = ""
    var stop: String = ""

    while (stop != "PARE") {
        println("Digite o nome do aluno para cadastrar (ou PARE para encerrar):")
        val add = readLine()!!.uppercase()

        if (add == "PARE") { // compara o que o usuário digitou
            stop = "PARE"
        } else {
            names += add + "\n"
        }
    }

    println("Os alunos cadastrados sao:")
    println(names)
}

