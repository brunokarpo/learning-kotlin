package read_write

import java.io.FileNotFoundException
import java.io.FileReader
import java.io.IOException
import java.nio.file.Files
import java.nio.file.Paths

fun main(args: Array<String>) {

    readFile2("message.txt")
    readFile("new-message.txt")

}

fun readFile2(filename: String) {

    val stream = Files.newInputStream(Paths.get(filename))
    stream.buffered().reader().use {
        reader -> println(reader.readText())
    }

}

fun readFile(filename: String) {

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