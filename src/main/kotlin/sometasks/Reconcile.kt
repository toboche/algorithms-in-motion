package sometasks

// To submit your answer to this question: Click on the "Share" button, which will generate a Link
// to your answer that you can paste into your application.
//
// Write a function called "reconcileHelper" that processes two arrays of integers.
// Each array will have only distinct numbers (no repeats of the same integer in
// the same array), and the arrays are not sorted.
// Your job is to find out which numbers are in array 1, but not array 2,
// and which numbers are in array 2, but not in array 1.

// Your function should return a string formatted as so:
// "Numbers in array 1 that aren't in array 2:
// <num1> <num2> <num3>...
//
// Numbers in array 2 that aren't in array 1:
// <num1> <num2> <num3>...
// "
//
// Each list of numbers should be listed in ascending order (lowest to largest)
//
// So for instance, if I passed in:
// reconcileHelper([5, 3, 4], [4, 3, 10, 6])
//
// The function would return this multiline string:
// "Numbers in array 1 that aren't in array 2:
// 5
//
// Numbers in array 2 that aren't in array 1:
// 6 10
// "
//
// Notes:
// 1) You are allowed to use any standard library functions, but if it has a way of
//        doing this EXACT problem, please don't use it.
//        For example, don't use a function to subtract one array from another. That's too easy.
// 2) Try to make your solution fast so that it can handle over 1,000,000 elements in each array.
//    (Doing a linear search through array `b`, for every element in array `a` will work, but is too slow.)
// 3) We don’t anticipate this taking you more than 30 minutes or so, but there is no hard limit.

fun reconcileHelper(a: Array<Int>, b: Array<Int>): String {
    val (missingInA, missingInB) = reconcileInnerHelper(a, b)
    return """
            Numbers in array 1 that aren't in array 2:\n +
            ${missingInB.joinToString(separator = " ")}
            Numbers in array 2 that aren't in array 1:
            ${missingInA.joinToString(separator = " ")}
        """.trimIndent()
}

fun reconcileInnerHelper(a: Array<Int>, b: Array<Int>): Pair<List<Int>, List<Int>> {
    val aHashSet = a.toHashSet()
    val bHashSet = b.toHashSet()

    val missingInB =
        a.filterNot { bHashSet.contains(it) }
    val missingInA =
        b.filterNot { aHashSet.contains(it) }
    return missingInA.sorted() to missingInB.sorted()
}

fun main() {
    val result = reconcileHelper(arrayOf(5, 3, 4), arrayOf(4, 3, 10, 6))

    // Should print:
    // Numbers in array 1 that aren't in array 2:
    // 5
    //
    // Numbers in array 2 that aren't in array 1:
    // 6 10
    println(result)
}

//A few tests I've used on the way:
//@Test
//fun sample() {
//    val (actualMissingInA, actualMissingInB) = reconcileInnerHelper(arrayOf(5, 3, 4), arrayOf(4, 3, 10, 6))
//
//    assertArrayEquals(arrayOf(6, 10), actualMissingInA.toTypedArray())
//    assertArrayEquals(arrayOf(5), actualMissingInB.toTypedArray())
//}
//
//@Test
//fun sample2() {
//    val (actualMissingInA, actualMissingInB) = reconcileInnerHelper(arrayOf(1), arrayOf())
//
//    assertArrayEquals(arrayOf(), actualMissingInA.toTypedArray())
//    assertArrayEquals(arrayOf(1), actualMissingInB.toTypedArray())
//}
//
//@Test
//fun sampleMillionFinishes() {
//    val inputA = Array(1_000_000) { Random.nextInt() }
//    val inputB = Array(1_000_000) { Random.nextInt() }
//
//    val (actualMissingInA, actualMissingInB) = reconcileInnerHelper(inputA, inputB)
//
//    assertNotEquals(0, actualMissingInA.size)
//    assertNotEquals(0, actualMissingInB.size)
//}