fun  main(){
    println("Ingrese su nombre: ")
    var name = readLine()!!

    println("Ingrese la nota 1: ")
    var nota1 = readLine()!!.toDouble()
    println("Ingrese la nota 2: ")
    var nota2 = readLine()!!.toDouble()
    println("Ingrese la nota 3: ")
    var nota3 = readLine()!!.toDouble()

    val notas = listOf(nota1, nota2, nota3)

    val sum = notas.sum()   

    var prom = sum /3

    if(prom < 2.5){
        println("El estudiante $name Perdio la materia con promedio $prom")
    }else if(prom > 2.6 && prom < 3.4){
        println("El estudiante $name Perdio la materia pero la puede recuperar")
    }else if(prom > 3.5){
        println("El estudiante $name Gano la materia con un promedio de $prom")
    }
}