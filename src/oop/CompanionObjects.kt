package oop

class Person {
    val name: String = "Bruno"

    fun showName() = println("My name is $name")

    /*
     * Companion object is like a static methods ou parameters of class. This can be accessible without instance objects
     */
    companion object {
        val familyName: String = "Nogueira"

        fun showFamilyName() = println("My family name is $familyName")
    }
}

fun main(args: Array<String>) {
    val person = Person()
    println(person.name)
    person.showName()

    /*
     * Here is where I call the attributes and functions of companion objects
     */
    println(Person.familyName)
    Person.showFamilyName()
}