package fungsi

inline fun hello(firstname: () -> String, noinline lastname: () -> String): String {
    return "Hello ${firstname()} ${lastname()}"
}

fun main(){
    println(hello({ "Fahri" }, { "Maulana" }))
}