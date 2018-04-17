package oop

open class Animal2() {

    var name: String? = null
    var color: String? = null
    var numLegs: Int? = null

    constructor(name: String, color: String): this(name, color, 4)

    constructor(name: String, color: String, numLegs: Int) : this() {
        this.name = name
        this.color = color
        this.numLegs = numLegs
    }

    fun showAnimal() {
        println("Name is: ${this.name}")
        println("Color is: ${this.color}")
        println("Num legs: ${this.numLegs}")
    }
}

class Cat() : Animal2("Cat", "Black", 4)

fun main(args: Array<String>) {
    var animal = Animal2("Animal", "Brown", 4)
    animal.showAnimal()

    var anotherAnimal = Animal2("Another animal", "Blue")
    anotherAnimal.showAnimal()

    var cat = Cat()
    cat.showAnimal()
}