class Factorial {
    tailrec fun fact(x: Int, acc: Int = 1): Int {
        val newAcc = acc * x
        return if (x == 1) newAcc else fact(x - 1, newAcc)
    }
}