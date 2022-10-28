package fungsi

inline fun hello(name: () -> String):String{
    return "Hello ${name()}"
}
fun main(){
    println(hello { "Fahri Maulana" })
    println(hello { "Al Ghazali" })
}