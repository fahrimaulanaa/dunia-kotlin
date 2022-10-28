package fungsi

infix fun String.to(type: String): String {
    if(type == "uppercase"){
        return this.toUpperCase()
    } else if(type == "lowercase"){
        return this.toLowerCase()
    } else {
        return this
    }
}

fun main() {
    val name = "Kotlin"
    println(name to "uppercase")
    println(name to "lowercase")
    println(name to "capitalize")
}