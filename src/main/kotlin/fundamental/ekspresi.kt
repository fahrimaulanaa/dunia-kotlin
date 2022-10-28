package fundamental

fun main(){
    println("Expresi dalam Kotlin")
    println()
    println("--------------------")
    println("If Else Expression")
    println("1. If Expression (Jika)")
    println("2. Else if Expression (Jika tidak)")
    println("3. Else Expression (Tidak)")

    val nilai = 80
    println("Nilai = $nilai")
    if (nilai > 80){
        println("Selamat Anda Lulus")
    } else if(nilai == 80){
        println("Nilai Anda Cukup")
    } else {
        println("Maaf Anda Tidak Lulus")
    }
    println("--------------------")
    println("When Expression")
    println("When adalah pengganti dari switch case")
    println("1. When Expression (Jika)")
    println("2. Else Expression (Tidak)")
    val nilai2 = 80
    println("Nilai = $nilai2")
    println("Contoh code")
    println("==============================")
    println("when (nilai2) {")
    println("    80 -> println(\"Nilai Anda Cukup\")")
    println("    100 -> println(\"Selamat Anda Lulus\")")
    println("    else -> println(\"Maaf Anda Tidak Lulus\")")
    println("}")
    println("==============================")
    println("Output:")
    when(nilai2){
        80 -> println("Nilai Anda Cukup")
        100 -> println("Selamat Anda Lulus")
        else -> println("Maaf Anda Tidak Lulus")
    }
    println("--------------------")
    println("When Multiple Expression")
    println("When multiple expression berfungsi untuk mengecek lebih dari satu kondisi")
    println("When multiple expression hanya bisa digunakan untuk tipe data String, Int, dan Char")
    println("1. When Expression (Jika)")
    println("2. Else Expression (Tidak)")
    val nilai3 = 'A'
    println("Nilai = $nilai3")
    println("Contoh code")
    println("==============================")
    println("when (nilai3) {")
    println(" 'A', 'B', '1C' -> println(\"Nilai Anda Cukup\")")
    println("    else -> println(\"Maaf Anda Tidak Lulus\")")
    println("}")
    println("==============================")
    println("Output:")
    when(nilai3){
        'A', 'B', 'C' -> println("Nilai Anda Cukup")
        else -> println("Maaf Anda Tidak Lulus")
    }
    println("--------------------")
    println("When Expression In")
    println("When expression in berfungsi untuk mengecek apakah nilai ada di dalam range")
    val nilai4 = 80
    println("Nilai = $nilai4")
    println("Contoh code")
    println("==============================")
    println("when (nilai4) {")
    println("    in 80..100 -> println(\"Selamat Anda Lulus\")")
    println("    in 70..79 -> println(\"Nilai Anda Cukup\")")
    println("    else -> println(\"Maaf Anda Tidak Lulus\")")
    println("}")
    println("==============================")
    println("Output:")
    when(nilai4){
        in 80..100 -> println("Selamat Anda Lulus")
        in 70..79 -> println("Nilai Anda Cukup")
        else -> println("Maaf Anda Tidak Lulus")
    }
    println("--------------------")
    println("When Expression Is")
    println("When expression is berfungsi untuk mengecek apakah nilai merupakan tipe data tertentu")
    val nilai5 = "80"
    println("Nilai = $nilai5")
    println("Contoh code")
    println("==============================")
    println("when (nilai5) {")
    println("    is String -> println(\"Nilai Anda Cukup\")")
    println("    else -> println(\"Maaf Anda Tidak Lulus\")")
    println("}")
    println("==============================")
    println("Output:")
    when(nilai5){
        is String -> println("Nilai Anda Cukup")
        else -> println("Maaf Anda Tidak Lulus")
    }
    println("--------------------")
    println("For Expression")
    println("For expression berfungsi untuk melakukan perulangan")
    println("1. For Loop (Perulangan)")
    println("2. For Loop (Perulangan dengan index)")
    println("3. For Loop (Perulangan dengan range)")
    println("--------------------")
    println("For Loop (Perulangan)")
    println("Contoh code")
    println("==============================")
    println("val list = listOf(\"A\", \"B\", \"C\")")
    println("for (item in list) {")
    println("    println(item)")
    println("}")
    println("==============================")
    println("Output:")
    val list = listOf("A", "B", "C")
    for (item in list) {
        println(item)
    }
    println("--------------------")
    println("For Range (Perulangan dengan range)")
    println("Contoh code")
    println("==============================")
    println("for (i in 1..10) {")
    println("    println(i)")
    println("}")
    println("==============================")
    println("Output:")
    for (i in 1..10) {
        println(i)
    }
    println("--------------------")
    println("While Expression")
    println("While expression berfungsi untuk melakukan perulangan")
    println("1. While Loop (Perulangan)")
    println("2. Do While Loop (Perulangan)")
    println("--------------------")
    println("While Loop (Perulangan)")
    println("Contoh code")
    println("==============================")
    println("var i = 1")
    println("while (i <= 10) {")
    println("    println(i)")
    println("    i++")
    println("}")
    println("==============================")
    println("Output:")
    var i = 1
    while (i <= 10) {
        println(i)
        i++
    }
    println("--------------------")
    println("Do While Loop (Perulangan)")
    println("Contoh code")
    println("==============================")
    println("var i = 1")
    println("do {")
    println("    println(i)")
    println("    i++")
    println("} while (i <= 9)")
    println("==============================")
    println("Output:")
    var j = 1
    do {
        println(j)
        j++
    } while (j <= 9)
    println("--------------------")
    println("Break Expression")
    println("Break expression berfungsi untuk menghentikan perulangan")
    println("Contoh code")
    println("==============================")
    println("for (i in 1..10) {")
    println("    if (i == 5) {")
    println("        break")
    println("    }")
    println("    println(i)")
    println("}")
    println("==============================")
    println("Output:")
    for (i in 1..10) {
        if (i == 5) {
            break
        }
        println(i)
    }
    println("--------------------")
    println("Continue Expression")
    println("Continue expression berfungsi untuk menghentikan perulangan saat kondisi terpenuhi")
    println("Contoh code")
    println("==============================")
    println("for (i in 1..10) {")
    println("    if (i == 5) {")
    println("        continue")
    println("    }")
    println("    println(i)")
    println("}")
    println("==============================")
    println("Output:")
    for (i in 1..10) {
        if (i == 5) {
            continue
        }
        println(i)
    }
    println("--------------------")
}