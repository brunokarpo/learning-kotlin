
/*
 * Difference between val and var
 */

fun main(args: Array<String>) {
    var myName = "Bruno"
    println(myName)

    myName = "James"
    println(myName)

    val newName = "Nogueira"
    /*
     * When we use 'val' keyword is not possible to change the value of variable. It's like a final variable on Java
        newName = "oliveira" // It's not possible.
        */
    println(newName)
}