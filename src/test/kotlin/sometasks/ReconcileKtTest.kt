package sometasks

import org.junit.Assert.assertArrayEquals
import org.junit.Test
import kotlin.random.Random
import kotlin.test.assertNotEquals

class ReconcileKtTest {
    @Test
    fun sample() {
        val (actualMissingInA, actualMissingInB) = reconcileInnerHelper(arrayOf(5, 3, 4), arrayOf(4, 3, 10, 6))

        assertArrayEquals(arrayOf(6, 10), actualMissingInA.toTypedArray())
        assertArrayEquals(arrayOf(5), actualMissingInB.toTypedArray())
    }

    @Test
    fun sample2() {
        val (actualMissingInA, actualMissingInB) = reconcileInnerHelper(arrayOf(1), arrayOf())

        assertArrayEquals(arrayOf(), actualMissingInA.toTypedArray())
        assertArrayEquals(arrayOf(1), actualMissingInB.toTypedArray())
    }

    @Test
    fun sampleMillionFinishes() {
        val inputA = Array(1_000_000) { Random.nextInt() }
        val inputB = Array(1_000_000) { Random.nextInt() }

        val (actualMissingInA, actualMissingInB) = reconcileInnerHelper(inputA, inputB)

        assertNotEquals(0, actualMissingInA.size)
        assertNotEquals(0, actualMissingInB.size)
    }
}