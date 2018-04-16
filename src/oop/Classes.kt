package oop

class House(type: String, price: Double, yearBuilt: Int, owner: String) {

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
}

fun main(args: Array<String>) {

    var myHouse = House("2 bedroom", 50000.0, 2010, "Bruno")

    println("My house $myHouse") // it will print the address of object in memory
    println("Type: ${myHouse.type}")
    println("Owner: ${myHouse.owner}")

    myHouse.price = 60000.0
    println("New price: ${myHouse.price}")

    var newHouse = House("3 bedroom", 80000.0, 2011, "Dayane")
    println("New house: ${newHouse.owner}")
}