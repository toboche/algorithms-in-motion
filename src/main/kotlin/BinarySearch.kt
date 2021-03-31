class BinarySearch {
    fun find(valueToFind: Int, values: List<Int>): Int? {
        var start = 0
        var end = values.size - 1
        while (start <= end) {
            val middle = (start + end) / 2
            val middleValue = values[middle]
            when {
                middleValue == valueToFind -> return middle
                middleValue > valueToFind -> end = middle - 1
                else -> start = middle + 1
            }
        }
        return null
    }
}