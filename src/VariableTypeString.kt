fun main(args: Array<String>) {

    /*
    When a I create a variable and put a value inside, the compiler is able to understand and define the type of
    variable. In case of variable 'country' the compiler understood that de variable country is a String variable.
     */
    var country = "Spain"
    println(country)

    country = "Mozambique"
    println(country)

    /*
    But we can define the type explicitly adding a colon and writing the type.
     */
    var city:String = "Maputo"
    println(city)
}