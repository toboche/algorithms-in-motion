package sometasks

class MergeSort {
    fun sort(input: Array<Int>, aux: Array<Int>, lo: Int = 0, hi: Int = input.size - 1) {
        val mid = (hi + lo) / 2
        if (hi == lo) {
            return
        }
        sort(input, aux, lo, mid)
        sort(input, aux, mid + 1, hi)
        merge(input, aux, lo, hi)
    }

    private fun merge(input: Array<Int>, aux: Array<Int>, lo: Int, hi: Int) {
        for (i in lo..hi) {
            aux[i] = input[i]
        }
        var i = lo
        val mid = (lo + hi) / 2
        var j = mid + 1
        var k = lo
        while (k <= hi) {
            when {
                i > mid -> input[k] = aux[j++]
                j > hi -> input[k] = aux[i++]
                aux[i] < aux[j] -> input[k] = aux[i++]
                else -> input[k] = aux[j++]
            }
            k += 1
        }
    }
}