import org.junit.Assert.assertEquals
import org.junit.Test

class SumTest {
    @Test
    fun test() {
        assertEquals(12, Sum().sum(listOf(2, 4, 6)))
    }
}