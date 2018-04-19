package read_write

import java.io.FileWriter
import java.io.IOException

fun main(args: Array<String>) {

    var message: String? = null

    do {
        print("Enter a message: ")
        message = readLine().toString()
    } while (message.isNullOrBlank())

    writeToFile2(message!!)

}

fun writeToFile2(message: String) {
    var writer: FileWriter? = null;

    try {
        writer = FileWriter("new-message.txt", true)
        writer.appendln(message)
    } catch (ex: IOException) {
        println("An error occur: $ex")
    } finally {
        writer!!.close()
    }
}