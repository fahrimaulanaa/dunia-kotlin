package expression

fun hello(value: String, transformer: (String) -> String): String {
    return "Hello ${transformer(value)}"
}

fun main(){
    val upperTransformer = {value: String -> value.toUpperCase()}
    val lowerTransformer = {value: String -> value.toLowerCase()}
    println(hello("Fahri Maulana", upperTransformer))
    println(hello("Fahri Maulana", lowerTransformer))
}