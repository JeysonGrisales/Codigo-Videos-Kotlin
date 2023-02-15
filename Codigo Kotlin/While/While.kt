fun main() {
    var opcion = int
    var numero1 = FLoat
    var numero2 = FLoat

    while(opcion != 5){
        print("Ingrese el primer numero: ")
        numero1 = readLine()!!
        print("Ingrese el segundo numero: ")
        numero2 = readLine()!!
        print("Seleccione una opcion \n 1. Sumar \n 2. Restar \n 3. Multiplicar \n 4. Dividir \n 5. Salir")
        opcion = readLine()!!
            when(opcion){
                1 -> print("La suma es: ${numero1 + numero2}")
                2 -> print("La resta es: ${numero1 - numero2}")
                3 -> print("La multiplicacion es: ${numero1 * numero2}")
                4 ->{
                    if(numero2 <= 0 ){
                        print("El segundo numero no puede ser negativo o cero")
                    }else{
                        print("La division es: ${numero1 / numero2}")
                    }
                }
                5 -> print("Prgrama Finalizado")
                else -> ("Dato invalido")
            }
    }
}
