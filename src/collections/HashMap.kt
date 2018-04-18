package collections

fun main(args: Array<String>) {

    var mMap = HashMap<String, String>()
    mMap.put("Mary", "Married")
    mMap.put("Paulo", "Married")
    mMap.put("John", "Single")

    println("Retrieve by key: ${mMap.get("Mary")}")

    for(entry in mMap.entries) println("My key '${entry.key}' has a value '${entry.value}'")
    println("\n========================\n")

    mMap.remove("Paulo")
    for(entry in mMap.entries) println("My key '${entry.key}' has a value '${entry.value}'")
    println("\n========================\n")

    mMap.set("John", "Married")
    for(entry in mMap.entries) println("My key '${entry.key}' has a value '${entry.value}'")
}