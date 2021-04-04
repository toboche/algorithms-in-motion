package geeksforgeeks

import org.junit.Assert.assertEquals
import org.junit.Test

class SubarrayWithGivenSumFinderTest {
    @Test
    fun testSample1() {
        val input = listOf(1, 2, 3, 7, 5)
        assertEquals(1 to 3, SubarrayWithGivenSumFinder().findSubarrayWithGivenSum(input, 12))
    }

    @Test
    fun testSample2() {
        val input = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        assertEquals(0 to 4, SubarrayWithGivenSumFinder().findSubarrayWithGivenSum(input, 15))
    }

    @Test
    fun testSample3() {
        val input = listOf(1, 2, 3, 17, 5)
        assertEquals(3 to 3, SubarrayWithGivenSumFinder().findSubarrayWithGivenSum(input, 17))
    }
}