package fungsi

fun sum(value1: Int, value2: Int): Int {
    val result = value1 + value2
    return result
}

fun main() {
    val value1 = 10
    val value2 = 10
    val total = sum(value1, value2)
    println(total)
}