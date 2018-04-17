package oop

fun String.removeFirstAndLastCharacter() = this.substring(1, this.length - 1)

/**
 * Remove a character of the text
 */
fun String.removeCharacter(character: Char) = this.replace(character.toString(), "", true)

fun Int.doubleNumber() = this + this
fun Int.add(number: Int) : Int = this + number
fun Long.factorial() : Long {
    if(this == 1L) {
        return this
    }
    return (this - 1).factorial() * this
}

fun main(args: Array<String>) {
    val name = "Bruno Nogueira"
    val result = name.removeFirstAndLastCharacter()
    println("Result is: $result")

    val number = 12
    val res = number.doubleNumber()
    println("Result is: $res")

    val anotherNumber = 30
    val res2 = anotherNumber.add(45)
    println("Result is: $res2")

    val text = "This is a simple text to test"
    val result2 = text.removeCharacter('i')
    println("Result is: '$result2'")

    val newNumber = 5L
    val res3 = newNumber.factorial()
    println("Result is: $res3")

}