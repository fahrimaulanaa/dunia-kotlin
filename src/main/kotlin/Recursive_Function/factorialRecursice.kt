package Recursive_Function

fun factorialRecursive(value: Int): Int {
    return when (value) {
        1 -> value
        else -> value * factorialRecursive(value - 1)
    }
}

fun main(){
    println("Recursive Function adalah sebuah fungsi yang memanggil dirinya sendiri")
    println("Contoh dari Recursive Function adalah Faktorial")
    println("Faktorial dari 5 adalah ${factorialRecursive(5)}")

}