package oop

open class Animal3() {

    var name: String? = null
    protected var color: String? = null
    private var numLegs: Int? = null // private can be accessed only by getters and setters

    constructor(name: String, color: String, numLegs: Int) : this() {
        this.name = name
        this.color = color
        this.numLegs = numLegs
    }

    open fun showAnimal() {
        println("Name is: ${this.name}")
        println("Color is: ${this.color}")
        println("Num legs: ${this.numLegs}")
    }

    // Don't judge me! I know how ungly is this
    fun getNumLegs(): Int? {
        return this.numLegs
    }
    // Don't judge me! I know how ungly is this
    fun setNumLegs(numLegs: Int) {
        this.numLegs = numLegs
    }

}

class Spider() : Animal3("Spider", "Black", 8) {

    override fun showAnimal() {
        super.color = "Red" // here I can access the protected parameter on class Animal3
        super.showAnimal()
    }

}


fun main(args: Array<String>) {
    var animal = Animal3("Lion", "Yellow", 4)
    animal.setNumLegs(3)
    animal.showAnimal()

    animal = Spider()
    // animal.color = "Blue" --> But here I have problem if I try access protected modifications
    animal.showAnimal()

}
