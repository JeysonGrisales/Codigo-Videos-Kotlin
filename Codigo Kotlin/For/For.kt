fun main() {
    print("Ingrese la cantidad de veces a repetir: ")
    var cant = readLine()!!.toInt()

        for(i in 0 until cant){
            print("Ingrese un numero 1: ")
            var numero1 = readLine()!!.toInt()
            print("Ingrese un numero 2: ")
            var numero2 = readLine()!!.toInt()
            var sum = numero1 + numero2
            print("La suma es : $sum")
                when{
                    sum >= 10 -> print("La suma es mayor o igual a dos digitos y es positivo!")
                    sum < 10 ->{
                        print("La suma arrojó un valor negativo")
                        if(sum < 10){
                            print("La suma es mayor o igual a dos digitos y es negativo!")
                        }else{
                            print("La suma arroja un valor de un dijito")
                        }
                    }
                    else -> print("La suma arroja un valor de un dijito y es positivo")
                }
        }
}