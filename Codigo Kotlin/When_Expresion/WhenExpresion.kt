// val nombre = readLine()!!
// val materia = readLine()!!
// val nota1 = readLine()!!.toDouble()
// val nota2 = readLine()!!.toDouble()
// val nota3 = readLine()!!.toDouble()
// val prom = (nota1 + nota2 + nota3) / 3
// print(prom)
// // if (prom >= 3.5) {
// // println("El estudiante $nombre GANÓ la materia $materia")
// // } else {
// // println("El estudiante $nombre PERDIÓ la materia $materia")
// // if (prom >= 2.5) {
// // println("$nombre Puede recuperar")
// // }
// // }
// // }

fun main(){
    print("Ingrese el numero del dia de la semana")
    var dia = readLine()!!.toInt()

    when(dia){
        1 -> print("Lunes")
        2 -> print("Martes")
        3 -> print("Miercoles")
        4 -> print("Jueves")
        5 -> print("Viernes")
        6 -> print("Sabado")
        7 -> print("Domingo")
        else -> print("Dato invalido")
    }
}


