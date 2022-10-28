package fungsi

//fungsi tanpa parameter
fun helloWorld(){
    println("Hello World")
}

fun hitungSegitiga(){
    val alas = 10
    val tinggi = 5
    val luas = alas * tinggi / 2
    println("Luas Segitiga = $luas")
}

fun main() {
    helloWorld()
    hitungSegitiga()
}
