fun main(){
    print("Ingrese el numero: ")
    var numero = readLine()!!.toInt()

    if(numero > 0){
        print("El numero es positivo")
    }else{
        print("El numero es negativo")
    }

    print("El numero es: $numero")
}