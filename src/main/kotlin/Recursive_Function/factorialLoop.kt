package Recursive_Function

fun factorialLoop(value: Int): Int {
    var result = 1
    for (i in value downTo 1) {
        result *= i
    }
    return result
}

fun main(){
    println("Recursive Function adalah sebuah fungsi yang memanggil dirinya sendiri")
    println("Contoh dari Recursive Function adalah Faktorial")
    println("Faktorial dari 5 adalah ${factorialLoop(5)}")

}