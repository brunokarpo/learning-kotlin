fun main(args: Array<String>) {

    var isTrue: Boolean = false

    do {
        print("How many simblings I have? ")
        var answer = readLine()!!.toInt()

        when(answer) {
            1 -> {
                println("You are correct!")
                isTrue = true
            }
            else ->
                    println("You are wrong! Try Again! \n")

        }

    } while(!isTrue)
}