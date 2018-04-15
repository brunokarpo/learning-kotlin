fun main(args: Array<String>) {
    val firstNumber = 2
    val secondNumber = 8

    var result = firstNumber / secondNumber
    println("The result is: $result") // Will print 'The result is: 0'

    println("The result is: ${firstNumber.toFloat() / secondNumber}") // Will print 'The result is: 0.25'
    println("The result is: ${firstNumber / secondNumber.toFloat()}") // Will print 'The result is: 0.25'

    val thirdNumber:Float = 2.0f
    val fourthNumber: Float = 8.0f

    var anotherResult = thirdNumber / fourthNumber
    println("The result is: ${anotherResult}")
}