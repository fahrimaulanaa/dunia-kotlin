package expression

fun main(){

    //deklarasi lambda
    val lambdaName: (String) -> String =
        {it.toUpperCase()}

    //mengeksekusi lambda
    val name = lambdaName("Fahri Maulana")
    println(name)
}