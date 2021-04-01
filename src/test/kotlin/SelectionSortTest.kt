import org.junit.Assert.*
import org.junit.Test

class SelectionSortTest {

    val systemUnderTest = SelectionSort()

    @Test
    fun test1() {
        val input = mutableListOf(1, 23, 4, 55, 0)

        val expected = arrayOf(0, 1, 4, 23, 55)

        assertArrayEquals(expected, systemUnderTest.sort(input).toTypedArray())
    }

    @Test
    fun testSingle() {
        val input = mutableListOf(1)

        val expected = arrayOf(1)

        assertArrayEquals(expected, systemUnderTest.sort(input).toTypedArray())
    }

    @Test
    fun testEmpty() {
        val input = mutableListOf<Int>()

        val expected = arrayOf<Int>()

        assertArrayEquals(expected, systemUnderTest.sort(input).toTypedArray())
    }
}