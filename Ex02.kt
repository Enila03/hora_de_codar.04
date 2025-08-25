fun main(){

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

}