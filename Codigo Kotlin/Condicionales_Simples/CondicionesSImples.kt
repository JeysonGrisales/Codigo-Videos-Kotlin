fun main() {
    print("Ingrese su nombre completo: ")
    var nombre = readLine()!!

    print("Ingrese la edad: ")
    var edad = readLine()!!.toInt()

    if(edad >= 18){
        print("La persona $nombre es MAYOR de edad, tiene $edad años")
    }else{
        print("La perosna $nombre es MENOR de edad, tiene $edad años")
    }
}