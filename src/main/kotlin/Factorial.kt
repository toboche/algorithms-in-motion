class Factorial {
    fun fact(x: Int): Int {
        return if (x == 1) {
            1
        } else {
            x * fact(x - 1)
        }
    }
}