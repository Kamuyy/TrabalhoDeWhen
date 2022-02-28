fun main(args: Array<String>) {
//remova os "//" do programa que você quiser usar.

    //taxas()
    //pagamento()
}
fun taxas(): Unit{
    println("Digite o Numero de Crianças Nascidas: ")
    val numeroDeCriancasNascidas = readLine()!!.toInt()

    println("Digite o Numeri de Habitantes: ")
    val numeroDeHabitantes = readLine()!!.toInt()

    println("Digite o Numero de Óbitos")
    val numeroDeObitos = readLine()!!.toInt()

    println("Escolha qual taxa você quer descobrir:\n1 - Taxa De Natalidade\n2 - Taxa de Óbitos")

    when(readLine()!!.toInt()){
        1 -> println("A Taxa de Natalidade é: ${(numeroDeCriancasNascidas * 1000) / numeroDeHabitantes} ")

        2 -> println("A Taxa de Óbito é: ${(numeroDeObitos * 1000) / numeroDeHabitantes} ")
        else -> println("Operação Invalida")
    }
}

fun pagamento(): Unit{
    println("Digite o total da conta: ")
    val totalDaCompra = readLine()!!.toFloat()
    println("Escolha o tipo de pagamen\n1 - À vista\n2 - À prazo(30 Dias)\n3 - À prazo parcelado")

    when(readLine()!!.toInt()) {
        1 -> println("O valor total Á vista é: ${totalDaCompra - ((totalDaCompra * 10) / 100)}")
        2 -> println("O Valor total Á prazo (30 dias) é: ${totalDaCompra + ((totalDaCompra * 3) / 100)}")
        3 -> println("O valor total Á prazo parcelado é ${totalDaCompra + ((totalDaCompra * 1.5) / 100)}")
        else -> println("Forma de pagamento invalida!!!")
    }
}
