package kotlin_things

class Outer {

    val mString = "Outside Nested Class"

    class NestedClass {
        val mString = "Inside Nested class"
        fun callInside() = "Function call from inside Nested class."
    }
}

fun main(args: Array<String>) {
    println(Outer().mString)
    println(Outer.NestedClass().mString) // look: I don't need to instance Outer to access NestedClass
    println(Outer.NestedClass().callInside())
}