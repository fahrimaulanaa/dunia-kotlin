package Recursive_Function

tailrec fun factorialTail(value: Int, total: Int = 1): Int {
    return when (value) {
        1 -> total
        else -> factorialTail(value - 1, total * value)
    }
}

fun main(){
    println("Tail Recursive Function adalah sebuah fungsi yang memanggil dirinya sendiri")
    println("Contoh dari Tail Recursive Function adalah Faktorial")
    println("Faktorial dari 5 adalah ${factorialTail(5)}")

}