package expression

fun main(){
    val result1 = hello("Fahri Maulana", {value: String ->
        value.toUpperCase()
    })
    val result2 = hello("Fahri Maulana") {value: String ->
        value.toLowerCase()
    }
    println(result1)
    println(result2)
}