import org.junit.Assert.assertArrayEquals
import org.junit.Test

class QuicksortTest {
    val systemUnderTest = Quicksort()

    @Test
    fun test1() {
        val input = arrayOf(1, 23, 4, 55, 0)

        val expected = arrayOf(0, 1, 4, 23, 55)

        assertArrayEquals(expected, systemUnderTest.sort(input))
    }

    @Test
    fun test2() {
        val input = arrayOf(1, 7, 0, 6, 2)

        val expected = arrayOf(0, 1, 2, 6, 7)

        assertArrayEquals(expected, systemUnderTest.sort(input))
    }

    @Test
    fun testSingle() {
        val input = arrayOf(1)

        val expected = arrayOf(1)

        assertArrayEquals(expected, systemUnderTest.sort(input))
    }

    @Test
    fun testEmpty() {
        val input = arrayOf<Int>()

        val expected = arrayOf<Int>()

        assertArrayEquals(expected, systemUnderTest.sort(input))
    }
}