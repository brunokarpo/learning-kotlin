package read_write

import java.io.FileNotFoundException
import java.io.FileReader
import java.io.FileWriter
import java.io.IOException

val filename: String = "App-message.txt"

fun main(args: Array<String>) {
    var continuee: Boolean

    do {
        continuee = menu()
        println("\n\n\n\n\n\n")
    } while(continuee)
}

fun menu(): Boolean {
    println("Options:")
    println("1 - Write")
    println("2 - Read")
    println("3 - Exit")
    print("Type your option: ")

    var choice = readLine()!!.toInt()

    when(choice) {
        1 -> {
            print("Type your message: ")
            var message = readLine().toString()
            writetoFile(message)
            return true
        }
        2 -> {
            println("Reading....")
            readfromFile()
            return true
        }
        3 -> {
            println("Exiting...")
            return false
        }
        else -> {
            println("Type a valid option")
            return true
        }
    }
}

fun writetoFile(message: String) {
    var writer: FileWriter? = null

    try {
        writer = FileWriter(filename, true)
        writer.appendln(message)
    } catch (ex: Exception) {
        println("An error occur: $ex")
    } finally {
        writer!!.close()
    }
}

fun readfromFile() {
    var reader: FileReader? = null
    var char: Int?

    try {
        reader = FileReader(filename)

        do {
            char = reader.read()
            print(char.toChar())

        } while(char != -1)

    } catch(ex: FileNotFoundException) {
        println("File doesn't exists: $ex")
    } catch (ex: IOException) {
        println("Error while reading file: $ex")
    } finally {
        reader!!.close()
    }
}