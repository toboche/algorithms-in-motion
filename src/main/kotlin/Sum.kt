class Sum {
    tailrec fun sum(input: List<Int>, acc: Int = 0): Int {
        return if (input.isEmpty()) {
            acc
        } else {
            val newAcc = acc + input.first()
            sum(input.drop(1), newAcc)
        }
    }
}