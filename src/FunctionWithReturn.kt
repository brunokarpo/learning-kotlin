fun main(args: Array<String>) {

    println("Multiply is: ${multiply(2, 3)}")

    var result = multiply(5, 2) / divide(4 , 2)

    println("Result: $result")

    println("Exp: ${factorial(4)}")
}

fun multiply(num1: Int, num2: Int) : Int {
    return num1 * num2
}

fun divide(num1: Int, num2: Int) : Int {
    return num1 / num2
}

fun factorial(num: Int) : Int{
    if (num == 1)
        return 1

    var newNum = num - 1
    return num * factorial(newNum)
}