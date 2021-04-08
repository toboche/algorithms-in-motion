package sometasks

import org.junit.Assert.*
import org.junit.Test

class MergeSortTest {
    @Test
    fun sample() {
        val input = arrayOf(9, 8, 7, 6, 5, 4, 3, 2, 0, 1)

        MergeSort().sort(input, Array(input.size) { 0 })

        assertArrayEquals(arrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9), input)
    }
}