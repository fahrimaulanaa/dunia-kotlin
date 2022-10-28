package Recursive_Function

tailrec fun display(value: Int) {
    println(value)
    if (value > 0) {
        display(value - 1)
    }
}

fun main(){
    println("Tail Recursive Function adalah sebuah fungsi yang memanggil dirinya sendiri")
    println("Contoh dari Tail Recursive Function adalah Faktorial")
    display(5)
}