package oop

class Outer {

    val mString = "Outside Nested Class"

    class NestedClass {
        val mString = "Inside Nested class"
        fun callInside() = "Function call from inside Nested class."
    }
}

fun main(args: Array<String>) {
    println(Outer().mString)
    println(Outer.NestedClass().mString)
    println(Outer.NestedClass().callInside())
}