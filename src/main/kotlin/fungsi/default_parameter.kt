package fungsi

fun hello(firstName: String, lastName: String = ""){
    println("Hello $firstName $lastName")
}

fun main(){
    hello("Kotlin")
    hello("Kotlin", "Developer")
}