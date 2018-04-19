package collections

/*
 * This is the right way to take Kotlin collections
 */
fun main(args: Array<String>) {

    // Immutable ArrayList
    val myListName = listOf<String>("Bruno", "Dayane", "Aldemiro", "Eliana")
    println("Name for index: ${myListName[0]}")
    // myListName[0] = "Ademir" // this don't work because the list created is immutable
    // myListName.add("Maria") // method 'add' is not available
    for (name in myListName) println("Name: $name")

    println("\n==================\n")

    // Immutable ArrayList of any type
    val mySecondList = listOf(1, "Ademir", 2.0, true)
    for (value in mySecondList) println("Value: $value")

    println("\n==================\n")

    // Mutable ArrayList
    val mutableList = mutableListOf<String>("Airplane", "Car", "Truck")
    mutableList[0] = "Train"
    mutableList.add("Motorcicle")
    for (value in mutableList) println("Value: $value")

    println("\n==================\n")

    // Mutable ArrayList of any type
    val mutableListAny = mutableListOf(1, true, "Truck", 2.0)
    mutableListAny[1] = "coin"
    mutableListAny.removeAt(3)
    for (value in mutableListAny) println("Value: $value")

    println("\n==================\n")

    // HashMap
    val myHashMap = hashMapOf(1 to "Bruno", 2 to "Dayane") // by inference this create a HashMap<Int, String>
    myHashMap.put(3, "Eliana")
    for (entry in myHashMap.entries) println("My key ${entry.key} has value ${entry.value}")

    println("\n==================\n")

    val myHashMapAny = hashMapOf(1 to "Bruno", "Maria" to true) // by inference this create a HashMap<Any, Any>
    for (entry in myHashMapAny.entries) println("My key ${entry.key} has value ${entry.value}")

    println("\n==================\n")

    // Array (Mutable)
    val myArray = arrayOf("Bruno", "Dayane", "Eliana", "Maria")
    myArray[0] = "Aldemiro"
    for(value in myArray) println("Value $value")
}