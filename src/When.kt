fun main(args: Array<String>) {

    val one = 1
    val two = 2
    val three = 3
    val four = 4
    val five = 5
    val six = 6

    print("Write a number between 1 - 10: ")
    val number = readLine()!!.toInt()

    /*
     * When expression is like to Switch case on Java. But you don't need to the 'break' statement
     */
    when(number) {
        one -> println("Wrong number")
        two -> println("Getting close!")
        three -> println("Closer")
        four -> println("Hmm...")
        five -> println("Well, you are lost!")
        six -> println("Bingo!")
        else -> {
            println("Sorry, you are way lost!")
        }
    }
}