class Sum {
    tailrec fun sum(input: List<Int>, acc: Int = 0): Int {
        return if (input.isEmpty()) {
            acc
        } else {
            val newAcc = acc + input.last()
            sum(input.dropLast(1), newAcc)
        }
    }
}