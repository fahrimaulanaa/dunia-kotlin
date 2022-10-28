package fungsi

fun double(value: Int): Int = value * 2
fun hi(name: String): String = "Hi $name"

fun main() {
    val value = 10
    val result = double(value)
    println(result)

    val name = "Kotlin"
    val message = hi(name)
    println(message)
}