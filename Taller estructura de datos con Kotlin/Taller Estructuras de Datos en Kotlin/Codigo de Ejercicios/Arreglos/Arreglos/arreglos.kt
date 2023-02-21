fun main() {

    val peers = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15)

    var numbers = mutableListOf<Int>()

    for(element in peers){
        if(element % 2 == 0){
            numbers.add(element)
        }
    }
    print("Numero divisibles por 2: $numbers")
}


