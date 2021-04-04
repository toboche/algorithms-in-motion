import org.junit.Assert.assertArrayEquals
import org.junit.Test

class DijkstraTest {


    @Test
    fun test1() {


        val graph = hashMapOf(
            "start" to mapOf("A" to 6, "B" to 2),
            "A" to mapOf("fin" to 1),
            "B" to mapOf("A" to 3, "fin" to 5),
            "fin" to mapOf()
        )

        assertArrayEquals(arrayOf("start", "B", "A", "fin"), Dijkstra().find(graph, "start", "fin"))
    }
}