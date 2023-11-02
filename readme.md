# File to JSON Converter

This project contains a Kotlin script that converts the contents of a file into a JSON format. The script reads text data from a file and serializes it into a JSON object, which can then be utilized in various applications.

## Functionality

The script includes two main functions:

- `convertFileToString(filePath: String): String` - reads the content of a file located at `filePath` and returns it as a string.
- `fileToJson(filePath: String): String` - converts the content of the file into a JSON string.

The generated JSON object has the following structure:

```json
{
  "data": "file contents"
}
