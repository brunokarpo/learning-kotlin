var myName = "Elliot" // global variable. Visible everywhere

fun main(args: Array<String>) {
    // var myName --> is a local variable just visible inside this function
    var name = "James"
    showName(name)
    showName()
}

fun showName() {
    println("Hello $myName")
}

fun showName(name: String) {
    println("Hello $name")
}