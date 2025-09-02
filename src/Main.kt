//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    println("========== HORA DE CODAR 4 ==========\n" +
            "Qual exercício deseja executar?\n" +
            "1 - Ex. Cadastrar Estudantes\n" +
            "2 - Ex. Array de planetas\n" +
            "3 - Ex. Lista de compras\n" +
            "4 - Sair")
    var option = readLine()!!.toInt()


    while (option != 4){

        when(option) {
            1 -> {
                ex01()
                break
            }
            2 -> {
                ex02()
                break
            }
            3 -> {
                ex03()
                break
            }
            4 -> println("Encerrando programa...")
            else -> println("Opção inválida")
        }

    }

}

fun ex01(){
    //Crie um programa onde o usuário possa cadastrar estudantes sem limites, e, em seguida, Se o usuário digitar "PARE" o programa deve exibir a quantidade de estudantes cadastrados e a lista com cada um deles.

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

    main()
}

fun ex02(){
    //Crie uma array de planetas que inclua "Terra", "Marte", "Plutão", "Vênus", "Júpiter", "Saturno"  e, em seguida, peça ao usuário para digitar o nome de um planeta.
    //Verifique se o planeta que o usuário informou está na array e informe ao usuário.

    val planetas = arrayOf("TERRA", "MARTE", "PLUTAO", "VENUS", "JUPITER", "SATURNO")
    var planUser : String
    var ver = false

    println("Digite o nome de um planeta:")
    planUser = readLine()!!.uppercase()

    for (i in planetas){
        if (planUser == i){
            ver = true
        }

    }

    if (ver == true){
        println("O planeta informado esta dentro do Array")
    } else {
        println("O planeta informado NAO esta dentro do Array")
    }

    main()

}

fun ex03(){
    //Crie uma array de frutas, exiba-a ao usuário e, em seguida, peça ao usuário para digitar o nome de uma das frutas.
    //Caso a fruta esteja no array, remova-a e exiba a mensagem "Fruta foi retirada da lista".
    //Peça novamente para o usuário digitar o nome de uma fruta para ser removida.
    //Sempre que o usuário procurar por uma fruta que não está no array exiba a mensagem "Fruta indisponível no nosso mercado".
    //Quando o array não possuir mais itens dentro de si, escreva "Lista de compras finalizada".

    var listaFrutas = mutableListOf<String>("MAÇÃ", "LARANJA", "BANANA", "ABACAXI", "LIMÃO", "MIRTILO", "UVA", "AMORA")

    while(listaFrutas.isNotEmpty()) {
        println("Digite o nome da fruta:")                  // readlnOrNull -> caso o usuário não digite nada
        //var busca = readlnOrNull()?.trim()?.uppercase()     //.trim -> para remover espaços brancos, espaços vazios
        var busca = readLine()?.trim()?.uppercase()

        if (listaFrutas.contains(busca)){
            listaFrutas.remove(busca)
            println("${busca} removida")
            println(listaFrutas)
        } else {
            println("${busca} indisponível no nosso mercado")
        }
    }
    println("Lista de compras finalizadas!")

    main()

}