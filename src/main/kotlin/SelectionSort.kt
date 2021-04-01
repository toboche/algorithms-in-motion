class SelectionSort {
    fun sort(input: MutableList<Int>): List<Int> {
        val output = mutableListOf<Int>()
        input.forEachIndexed { index, i -> }
        for (i in input.indices) {
            output.add(input.removeAt(findSmallest(input)))
        }
        return output
    }

    private fun findSmallest(input: List<Int>): Int {
        var smallest = input[0]
        var smallestIndex = 0
        for (i in 1 until input.size) {
            if (input[i] < smallest) {
                smallest = input[i]
                smallestIndex = i
            }
        }
        return smallestIndex
    }
}