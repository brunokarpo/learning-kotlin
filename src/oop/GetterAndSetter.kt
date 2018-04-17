package oop

class House2(type: String, price: Double, yearBuilt: Int, owner: String) {
    var type: String? = null
    var price: Double? = null
    var yearBuilt: Int? = null
    var owner: String? = null

    init {
        this.type = type
        this.price = price
        this.yearBuilt = yearBuilt
        this.owner = owner
    }

    /*
     * Please, don'n judge me! I know this is a bad practice on Kotlin programming. I used it just for a example
     */
    fun GetType(): String? {
        println("Returning by function")
        return this.type
    }

    fun SetType(type: String) {
        this.type = type
    }
}

fun main(args: Array<String>) {

    var myHouse = House2("2 Bedrooms", 50000.0, 2009, "Bruno")

    println(myHouse.type)
    println(myHouse.GetType())

    myHouse.SetType("3 Bedrooms")
    println(myHouse.type)
    println(myHouse.GetType())

}