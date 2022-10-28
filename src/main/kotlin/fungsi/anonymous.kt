package fungsi

import expression.hello

fun main(){
    val anonymousUpper = fun(value: String): String {
        if(value.isBlank()){
            return "Ups"
        } else {
            return value.toUpperCase()
        }
    }
    val result = hello("Fahri Maulana", anonymousUpper)
    println(result)
}