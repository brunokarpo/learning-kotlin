package oop.advanced_oop

abstract class GraphicObject {

    fun moveTo(newX: Int, newY: Int) {
        println("Move object to ($newX, $newY)")
        draw()
        resize()
    }

    protected abstract fun draw()
    protected abstract fun resize()

}

class Circle: GraphicObject() {
    override fun draw() {
        println("Drawing a circle")
    }

    override fun resize() {
        println("Resizing circle")
    }
}

class Triangle: GraphicObject() {
    override fun draw() {
        println("Drawing a triangle")
    }

    override fun resize() {
        println("Resizing a triangle")
    }
}

fun main(args: Array<String>) {
    var circle: GraphicObject = Circle()
    circle.moveTo(12, 5)

    var triangle: GraphicObject = Triangle()
    triangle.moveTo(5, 3)

}