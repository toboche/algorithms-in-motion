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

        arrayOf(12,213,23,123).sliceArray(0..input.size-1)
    }

    @Test
    fun testSample1Item() {
        val input = listOf(42)
        assertEquals(0 to 0, SubarrayWithGivenSumFinder().findSubarrayWithGivenSum(input, 42))
    }
}