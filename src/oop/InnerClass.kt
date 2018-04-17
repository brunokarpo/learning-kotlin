package oop

class Outer2 {
    val mString = "Outside Nested class"

    inner class NestedClass2 { // when I declare 'inner' it's necessary initialize the outside class to use the inner class
        val newString = "Inside Nasted class"

        fun getStuff() = mString // Inner class can access parameter of outside classes, but Nested class cannot

        fun callInside()= "Function call from inside Nested class."
    }
}

fun main(args: Array<String>) {
    println("Using Outer object: ${Outer2().NestedClass2().getStuff()}") // look: I need to instance Outer2 to access NestedClass2

    val inner = Outer2().NestedClass2()
    println("Using inner object: ${inner.getStuff()}")
}