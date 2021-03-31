import org.junit.Assert.assertSame
import org.junit.Test

class BinarySearchTest {

    val systemUnderTest = BinarySearch()

    @Test
    fun test1() {
        val values = listOf(1, 2, 3, 4, 5, 6)

        assertSame(4, systemUnderTest.find(5, values))
    }

    @Test
    fun test2() {
        val values = listOf(1, 2, 3, 4, 5, 6)

        assertSame(0, systemUnderTest.find(1, values))
    }

    @Test
    fun testSingle() {
        val values = listOf(1)

        assertSame(0, systemUnderTest.find(1, values))
    }

    @Test
    fun test3() {
        val values = listOf(1, 2, 3, 4, 5, 6)

        assertSame(null, systemUnderTest.find(10, values))
    }

    @Test
    fun test4() {
        val values = listOf<Int>()

        assertSame(null, systemUnderTest.find(10, values))
    }
}