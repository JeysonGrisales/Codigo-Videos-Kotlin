fun main() {
    print("¿Cuántas personas deseas ingresar? ")
    val cantPeople = readLine()!!.toInt()

    val names = mutableSetOf<String>()
    val ages = mutableSetOf<Int>()

    for (i in 1..cantPeople) {
        print("Ingresa el nombre de la persona $i: ")
        val name = readLine()!!
        print("Ingresa la edad de la persona $i: ")
        val age = readLine()!!.toInt()
        names.add(name)
        ages.add(age)
    }

    println("Las personas que ingreso son:")
    for (name in names) {
        val age = ages.elementAt(names.indexOf(name))
        if(age >= 18){
        println("-> La persona $name tiene $age y es MAYOR de edad")
        }else{
        println("-> La persona $name tiene $age y es MENOR de edad")
        }
    }
}