package fungsi

fun main() {
    var counter:Int = 0
    val lambdaIncrement: () -> Unit = {
        println("Lambda Increment")
        counter++
    }
    lambdaIncrement()
    println(counter)
}