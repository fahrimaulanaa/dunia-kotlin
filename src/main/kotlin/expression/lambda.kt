package expression

fun main(){
    val lambdaName: (String) -> String = {value: String ->
        value.toUpperCase()}

    val name = "Fahri Maulana"
    println(lambdaName(name))
}