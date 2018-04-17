package oop

open class Animal2(name: String, color: String, numLegs: Int) { // this is the default constructor

    var name: String? = null
    var color: String? = null
    var numLegs: Int? = null

    init { // this peace of code is called in initializer of class implementing the default constructor
        this.name = name
        this.color = color
        this.numLegs = numLegs
    }

    constructor(): this("Animal", "Blue", 6) // this is a constructor no args parameters that initialize class with default values

    constructor(name: String): this(name, "White") // this constructor receive only one parameter and call another constructor

    constructor(name: String, color: String): this(name, color, 4) // this constructor receive two parameters and call de default constructor

    open fun showAnimal() {
        println("Name is: ${this.name}")
        println("Color is: ${this.color}")
        println("Num legs: ${this.numLegs}")
    }
}

class Cat() : Animal2("Cat", "Black", 4) // this is a class that no have body and is created with default values receive on invocation of parent class

class Dog() : Animal2("Dog", "Brown", 4)

class Armadilo(name: String, color: String, numLegs: Int, nickname: String) : Animal2(name, color, numLegs) {
    var nickname: String? = null

    init {
        this.nickname = nickname
    }

    override fun showAnimal() {
        super.showAnimal()
        println("Nickname is: ${this.nickname}")
    }
}

fun main(args: Array<String>) {
    var animal = Animal2("Animal", "Brown", 4)
    animal.showAnimal()
    println("==========================")

    var anotherAnimal = Animal2("Another animal", "Blue")
    anotherAnimal.showAnimal()
    println("==========================")

    var newAnimal = Animal2("New Animal")
    newAnimal.showAnimal()
    println("==========================")

    var animalNoArgsConstructor = Animal2()
    animalNoArgsConstructor.showAnimal()
    println("==========================")

    var cat = Cat()
    cat.showAnimal()
    println("==========================")

    var dog = Dog()
    dog.showAnimal()
    println("==========================")

    var armadilo = Armadilo("Armadilo", "Brown", 4, "Tatu")
    armadilo.showAnimal()
}