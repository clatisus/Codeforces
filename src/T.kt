fun main() {
    val (a, b, c, d, e, f) = listOf(1, 2, 3, 4, 5, 6)
    println(a)
    println(b)
    println(c)
    println(d)
    println(e)
    println(f)
}

private operator fun <E> List<E>.component6() = this[5]
