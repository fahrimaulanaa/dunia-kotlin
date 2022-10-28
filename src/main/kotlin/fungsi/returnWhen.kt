package fungsi

fun sayNama(name: String = ""): String {
    return when(name){
        "" -> "Hello Bro"
        else -> "Hello $name"
    }
}

fun main(){
    println(sayNama())
    println(sayNama("Kotlin"))
}