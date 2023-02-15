fun main() {
    var numero = Int
    var continuar = "si"

    do{
        print("Ingrese el numero: ")
        numero = readLine()!!

        if(numero < 0){
            numero * -1
        }

        print("El numero positivo es $numero")
        print("¿Quiere ingresar otro numero? si o no: ")
        continuar = readLine()!!

    }while(continuar.uppercase() = "SI")
}
