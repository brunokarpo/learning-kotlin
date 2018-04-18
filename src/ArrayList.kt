fun main(args: Array<String>) {

    var myArrayList = ArrayList<String>()
    myArrayList.add("Paul")
    myArrayList.add("James")
    myArrayList.add("Bonni")

    for(name in myArrayList) {
        println("Name: $name")
    }

    println("\n========================\n")

    for(index in 0..myArrayList.size - 1) {
        println("Name: ${myArrayList.get(index)}")
    }

    println("\n========================\n")

    myArrayList.remove("James")
    myArrayList.forEach { name -> println("Name: $name") }

    println("\n========================\n")

    myArrayList.add(1, "Mergie")
    myArrayList.forEach { name -> println("Name: $name") }

    println("\n========================\n")

    myArrayList.set(0, "Bryan")
    myArrayList.forEach { name -> println("Name: $name") }

    println("\n========================\n")
}