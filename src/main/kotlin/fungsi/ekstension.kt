package fungsi

fun String.hello(): String {
    return "Hello $this"
}

fun main() {
    val name = "Kotlin"
    println(name.hello())
}