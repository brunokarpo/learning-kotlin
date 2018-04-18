fun main(args: Array<String>) {
    var mArray = Array<Int>(5){0}

    for(element in mArray) {
        println("Item: $element")
    }

    var mArray2 = Array<Int>(5){5}
    mArray2[0] = 3
    mArray2[1] = 33
    mArray2[2] = 333
    mArray2[3] = 3333
    mArray2[4] = 33333
    mArray2.forEach { element -> println("Item: $element") }

    for(index in 0..mArray2.size -1) {
        println("Item: ${mArray2[index]}")
    }

    var mArray3 = Array<String>(5){"Mandona"}
    mArray3.iterator().forEach { element -> println("Item '$element'") }

}