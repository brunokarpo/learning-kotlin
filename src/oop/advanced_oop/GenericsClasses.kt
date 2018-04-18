package oop.advanced_oop

class Login<T> (var name: T, var password: T) {
    init {
        println("Name: $name / password: $password")
    }
}

class Person(val name: String = "") {
    init {
        println("Name: $name")
    }

    override fun toString(): String {
        return "Person: $name"
    }
}

fun main(args: Array<String>) {

    var login = Login<String>("John", "John")
    var login2 = Login<Int>(2, 6)
    var login3 = Login<Boolean>(true, false)

    var loginPerson = Login<Person>(Person("Bruno"), Person("Dayane"))
}