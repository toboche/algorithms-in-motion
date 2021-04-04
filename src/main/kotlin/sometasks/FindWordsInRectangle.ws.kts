val input = """ 
    KOTE
    NULE
    AFIN
"""

val dictionaryRaw = "Kotlin, fun, file, line, null"

var directions = listOf(1 to 0, 0 to 1, -1 to 0, 0 to -1)

val rectangle = input.trimIndent().split("\n")
val dictionary = dictionaryRaw.toUpperCase().split(", ").toSet()
val prefixes = dictionary.flatMap { word ->
    List(word.length + 1) {
        word.take(it)
    }
}.toSet()

fun search(x: Int, y: Int, word: String) {
    if (word !in prefixes) {
        return
    }
    if (word in dictionary) {
        println(word)
    }
    for ((dx, dy) in directions) {
        val xNew = x + dx
        val yNew = y + dy
        val letter = rectangle.getOrNull(yNew)?.getOrNull(xNew) ?: continue
        search(xNew, yNew, word + letter)
    }
}

for (y in rectangle.indices) {
    for (x in rectangle[0].indices) {
        search(x, y, rectangle[x][y].toString())
    }
}

