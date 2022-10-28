package fundamental

fun main(){
    println("--Operator Dalam Kotlin--")
    println()
    println("--------------------")
    println("Operator Aritmatika")
    println("1. + (Penjumlahan)")
    println("2. - (Pengurangan)")
    println("3. * (Perkalian)")
    println("4. / (Pembagian)")
    println("5. % (Modulus)")
    println("6. ++ (Increment)")
    println("7. -- (Decrement)")
    println("--------------------")
    var a: Int = 10
    var b: Int = 5
    println("a = $a")
    println("b = $b")
    println("a + b = ${a + b}")
    println("a - b = ${a - b}")
    println("a * b = ${a * b}")
    println("a / b = ${a / b}")
    println("a % b = ${a % b}")
    println("a++ = ${a++}")
    println("a-- = ${a--}")
    println("--------------------")
    println("Operator Perbandingan")
    println("1. == (sama dengan)")
    println("2. != (tidak sama dengan)")
    println("3. > (lebih besar dari)")
    println("4. < (lebih kecil dari)")
    println("5. >= (lebih besar dari sama dengan)")
    println("6. <= (lebih kecil dari sama dengan)")
    println("--------------------")
    var c: Int = 10
    var d: Int = 5
    println("c = $c")
    println("d = $d")
    println("c == d = ${c == d}")
    println("c != d = ${c != d}")
    println("c > d = ${c > d}")
    println("c < d = ${c < d}")
    println("c >= d = ${c >= d}")
    println("c <= d = ${c <= d}")
    println("--------------------")
    println("Operator Logika")
    println("1. && (AND) untuk memeriksa dua kondisi")
    println("2. || (OR) untuk memeriksa salah satu kondisi")
    println("3. ! (NOT) untuk membalikkan kondisi")
    println("--------------------")
    var e: Boolean = true
    var f: Boolean = false
    println("e = $e")
    println("f = $f")
    println("e && f = ${e && f}")
    println("e || f = ${e || f}")
    println("!e = ${!e}")
    println("!f = ${!f}")
    println("--------------------")
    println("Operator Boolean")
    val nilai = 80
    val absen = 80
    val hasil = nilai > 75 && absen > 75
    println("Nilai: $nilai")
    println("Absen: $absen")
    println("hasil = nilai > 75 && absen > 75 = $hasil")
    println("--------------------")
    println("Operator Ternary")
    println("1. ?: (Elvis Operator)")
    println("2. as? (Safe Cast Operator)")
    println("--------------------")
    val nilai2 = 80
    val absen2 = 80
    val hasil2 = if (nilai2 > 75 && absen2 > 75) "Lulus" else "Tidak Lulus"
    println("Nilai: $nilai2")
    println("Absen: $absen2")
    println("hasil2 = if (nilai2 > 75 && absen2 > 75) \"Lulus\" else \"Tidak Lulus\" = $hasil2")
    println("--------------------")




}