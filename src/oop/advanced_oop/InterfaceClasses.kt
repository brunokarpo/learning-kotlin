package oop.advanced_oop

fun main(args: Array<String>) {
    var mButton: InputHandler = Button()
    mButton.clicked()

    var mPhone: InputHandler = Phone()
    mPhone.clicked()
}

interface InputHandler {
    fun clicked()
}

class Button: InputHandler {
    override fun clicked() {
        println("Button clicked")
    }
}

class Phone: InputHandler {
    override fun clicked() {
        println("Phone clicked")
    }
}