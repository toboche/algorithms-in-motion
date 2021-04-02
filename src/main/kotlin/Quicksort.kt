import kotlin.random.Random

class Quicksort {
    fun sort(array: Array<Int>): Array<Int> {
        return if (array.size < 2) {
            array
        } else {
            val pivot = array[Random.nextInt(0, array.size - 1)]
            val less = array.filter { it < pivot }
            val greater = array.filter { it > pivot }
            sort(less.toTypedArray()) + pivot + sort(greater.toTypedArray())
        }
    }
}