import kotlinx.serialization.*
import kotlinx.serialization.json.*
import java.io.File
import java.nio.charset.StandardCharsets

@Serializable
data class Data(
    val data: String,
)

fun convertFileToString(filePath: String): String {
    return try {
        File(filePath).readText(StandardCharsets.UTF_8)
    } catch (e: Exception) {
        throw Exception("Error reading file: ${e.message}", e)
    }
}

fun fileToJson(filePath: String): String {
    val fileContent = convertFileToString(filePath)
    val data = Data(data = fileContent)
    return Json.encodeToString(data)
}

fun main() {
    val filePath = "file_url"

    try {
        val jsonContent = fileToJson(filePath)
        println(jsonContent)
    } catch (e: Exception) {
        println(e.message)
    }
}
