import java.util.*

val graph = mutableMapOf<String, Array<String>>()

graph["you"] = arrayOf("alice", "bob", "claire")
graph["bob"] = arrayOf("anuj", "peggy")
graph["alice"] = arrayOf("peggy")
graph["claire"] = arrayOf("thom", "jonny")
graph["anuj"] = emptyArray()
graph["peggy"] = emptyArray()
graph["thom"] = emptyArray()
graph["jonny"] = emptyArray()

val searchQueue = ArrayDeque<String>()
searchQueue.add("you")

val visited = mutableSetOf<String>()

while (searchQueue.isNotEmpty()) {
    val person = searchQueue.pop()
    if (person.isAMangoSeller()) {
        print("$person is a mango seller")
        break
    } else {
        visited.add(person)
        val elements = graph[person]!!.toList()
            .filterNot { visited.contains(it) }
        searchQueue.addAll(elements)
    }
}
fun String.isAMangoSeller(): Boolean {
    return this == "anuj"

}
