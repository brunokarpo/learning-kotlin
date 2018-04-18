package oop.advanced_oop

enum class Suits {
    HEARTS,
    SPADES,
    DIAMONDS,
    CLUBS
}

enum class Directions(val nameDirection: String, val signOfDirection: Char) {
    NORTH("North", 'N'),
    SOUTH("South", 'S'),
    EAST("East", 'E'),
    WEST("West", 'W')
}

fun main(args: Array<String>) {

    var cardPlayer = Suits.DIAMONDS
    var cardPlayer2 = Suits.CLUBS

    if(cardPlayer == Suits.DIAMONDS) println("You are doing great!")
    if(cardPlayer2 == Suits.CLUBS) println("Hello there! Things are not so well")

    var playerDirections = Directions.EAST
    println("${playerDirections.nameDirection} (${playerDirections.signOfDirection})")
    if(playerDirections == Directions.EAST) println("You are going Eastbound")
}