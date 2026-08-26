package util

import app.morphe.patcher.PatchListGenerator
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import java.io.File

fun main() {
    val generator = PatchListGenerator()
    val patchList = generator.generate()

    val gson = GsonBuilder().setPrettyPrinting().create()
    val json = gson.toJson(patchList)

    val outputFile = File("patches-list.json")
    outputFile.writeText(json)
    println("Generated $outputFile")
}