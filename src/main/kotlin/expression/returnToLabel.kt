package expression

fun test(name:String, param: (String) -> Unit): Unit = param(name)
fun main(){
    test("Fahri Maulana") {
        if (it == "Fahri Maulana"){
            return@test
        }
        println("Hello $it")
    }
    println("End of Program")
}