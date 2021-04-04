package geeksforgeeks

class SubarrayWithGivenSumFinder {
    fun findSubarrayWithGivenSum(array: List<Int>, expectedSum: Int): Pair<Int, Int>? {
        if (array.isEmpty()) {
            return null
        }

        if (array.size == 1) {
            if (array[0] == expectedSum) {
                return 0 to 0;
            }
        }

        var start = 0
        var end = 1
        var currentSum = array[0] + array[1]
        while (start != array.size - 1 || end != array.size - 1) {
            if (currentSum < expectedSum) {
                if (end < array.size - 1) {
                    end += 1
                }
                currentSum += array[end]
            } else if (currentSum > expectedSum) {
                currentSum -= array[start]
                if (start < array.size - 1) {
                    start += 1
                }
            }
            if (currentSum == expectedSum) {
                return start to end
            }
        }
        return null
    }
}