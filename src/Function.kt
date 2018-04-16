fun main(args: Array<String>) {
    add(2, 3)
    subtract(3, 1, 5)
}

fun add(num1: Int, num2: Int) {
    var result = num1 + num2
    println("Sum is: $result")
}

fun subtract(num1: Int, num2: Int, num3: Int) {
    var result = num1 - num2 - num3
    println("Result is: $result")
}