fun main(){
    print("Ingrese su nombre: ")
    var nombre = readLine()!!

    print("Ingrese la materia: ")
    var materia = readLine()!!

    print("Ingrese la nota 1: ")
    var nota1 = readLine()!!.toDouble()
    print("Ingrese la nota 2: ")
    var nota2 = readLine()!!.toDouble()
    print("Ingrese la nota 3: ")
    var nota3 = readLine()!!.toDouble()

    var prom = (nota1 + nota2 + nota3) / 3

    if(prom > 3.5){
        print("El estudiante $nombre gano la materia $materia")
    }else if(prom > 2.5 && prom < 3.4){
        print("El estudinate $nombre perdio $materia pero puede recuperar")
    }else{
        print("El estudiante $nombre perdio la materia!!")
    }
}