package fungsi

fun sayHelloName(name: String = ""): String{
    return if(name == ""){
        "Hello Bro"
    } else {
        "Hello $name"
    }
}

fun main(){
    println(sayHelloName())
    println(sayHelloName("Kotlin"))
}