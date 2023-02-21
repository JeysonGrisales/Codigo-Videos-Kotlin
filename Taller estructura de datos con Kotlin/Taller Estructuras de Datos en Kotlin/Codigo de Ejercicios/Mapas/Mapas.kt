fun main(){
    var countries = mapOf(
        "COLOMBIA" to "Bogota",
        "ESPAÑA" to "Madrid",
        "VENEZUELA" to "Caracas",
        "ARGENTINA" to "Buenos Aires",
        "ECUADOR" to "Quito",
        "CHILE" to "Santiago de Chile",
        "BRAZIL" to "Brazilia",
        "MEXICO" to "Ciudad de Mexico",
        "ESTADOS UNIDOS" to "Washington D.C."
    )
    

    print("Ingrese el nombre de un pais: ")
    var nameCountries = readLine()!!.toUpperCase()

    var capitalCountries = countries[nameCountries]

    if(capitalCountries != null){
        print("La capital de $nameCountries es: $capitalCountries")
    }else{
        print("No se encontro la capital de $nameCountries")
    }


}