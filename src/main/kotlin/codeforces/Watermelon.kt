fun main() {
    val w = readLine()!!.toInt()
    when {
        w < 4 -> println("NO")
        w % 2 == 0 -> println("YES")
        else -> println("NO")
    }
}