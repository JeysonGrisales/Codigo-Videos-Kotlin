fun main(){
    val truckers = listOf(
        Pair("R-101", "Volvo"),
        Pair("R-102", "Mercedes-Benz"),
        Pair("R-103", "Scania"),
        Pair("R-104", "MAN"),
        Pair("R-105", "Iveco")
    )

    print("Ingresa la reference del camión que deseas buscar: ")
    val reference = readLine()

    val mark = truckers.find { it.first == reference }?.second

    if (mark != null) {
        println("La Marca del camión con reference $reference es $mark")
    } else {
        println("No se encontró la reference $reference")
    }
}
