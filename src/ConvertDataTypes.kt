fun main(args: Array<String>) {

    var number = 30

    println(number.toString() + 10) // will print 1010
    println(number + 10) // will print 40
    println(number.toDouble() + 10) // will print 40.0
    println(number.toFloat() + 10) // will print 40.0

    var bloodPressure = 89.0
    println(bloodPressure)
    number = bloodPressure.toInt()
    println(number)
}