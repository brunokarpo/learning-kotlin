package oop

fun main(args: Array<String>) {

    val point1 = Point(12, 4)
    val point2 = Point(6, -8)

    var resultPoint = point1 + point2
    println("Result point is: (${resultPoint.x}, ${resultPoint.y})")

    resultPoint = point1 - point2
    println("Result point is: (${resultPoint.x}, ${resultPoint.y})")

    resultPoint = point1 * point2
    println("Result point is: (${resultPoint.x}, ${resultPoint.y})")

    resultPoint = point1 / point2
    println("Result point is: (${resultPoint.x}, ${resultPoint.y})")

    resultPoint = point1 % point2
    println("Result point is: (${resultPoint.x}, ${resultPoint.y})")
}

class Point(val x: Int = 0, val y: Int = 0) {

    operator fun plus(point: Point): Point {
        return Point(x + point.x, y + point.y)
    }

    operator fun minus(point: Point): Point {
        return Point(x - point.x, y - point.y)
    }

    operator fun times(point: Point): Point {
        return Point(x * point.x, y * point.y)
    }

    operator fun div(point: Point): Point {
        return Point(x / point.x, y / point.y)
    }

    operator fun rem(point: Point): Point {
        return Point(x % point.x, y % point.y)
    }
}
