fun main(args: Array<String>) {
    var age = 28 // we are implicitly defining age to be an Integer type
    println(age)

    var name: String = "Bruno"
    var myAge: Int = 28
    println("My name is $name and I'm $myAge years old")

    /*
    We can problems if define a variable but don't put value inside there.
    Something like this:

    var name:String
    println("My name is $name")

    This is an error because the compiler have a null-checker. To do this works we have to put a '?' in front of variable
     and we can define this variable as a null anytime
     */

    var lastName:String?
    lastName = "N. de Oliveira"
    println("My lastname is $lastName")

    /*
    There is no possible to set a null value in a variable that never having the '?'. For example:

    name = null
     */


}