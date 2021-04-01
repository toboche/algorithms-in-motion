import org.junit.Assert.assertEquals
import org.junit.Test

class FactorialTest {
    @Test
    fun fact1() {
        assertEquals(1, Factorial().fact(1))
    }

    @Test
    fun fact2() {
        assertEquals(2, Factorial().fact(2))
    }

    @Test
    fun fact6() {
        assertEquals(720, Factorial().fact(6))
    }
}