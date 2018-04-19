package read_write

import java.io.FileWriter

fun main(args: Array<String>) {

    val message = "New message"
    writeToFile(message)

}

fun writeToFile(message: String) {
    var writer: FileWriter? = null

    try {
        writer = FileWriter("message.txt")
        writer.write(message)
    } catch (ex: Exception) {
        println("An error occur: $ex")
    } finally {
        writer!!.close()
    }
}