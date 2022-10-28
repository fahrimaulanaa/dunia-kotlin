package fundamental

fun main() {
    println("--Kotlin type data--")
    println("--------------------")
    println("Tipe data Numerik")
    var age: Byte = 20
    var height: Int = 170
    var distance: Short = 2000
    var balance: Long = 100000000L
    var weight: Float = 60.5F
    var distance2: Double = 100000000.0
    println("Umur: $age" + " type data: " + age::class.simpleName)
    println("Tinggi: $height" + " type data: " + height::class.simpleName)
    println("Jarak: $distance" + " type data: " + distance::class.simpleName)
    println("Saldo: $balance" + " type data: " + balance::class.simpleName)
    println("Berat: $weight" + " type data: " + weight::class.simpleName)
    println("Jarak: $distance2" + " type data: " + distance2::class.simpleName)
    println("--------------------")
    println("Tipe data Boolean")
    var isMarried: Boolean = false
    var isMarried2: Boolean = true
    println("Menikah: $isMarried" + " type data: " + isMarried::class.simpleName)
    println("Menikah: $isMarried2" + " type data: " + isMarried2::class.simpleName)
    println("--------------------")
    println("Tipe data Character")
    var letter: Char = 'A'
    var letter2: Char = 'B'
    println("Huruf: $letter" + " type data: " + letter::class.simpleName)
    println("Huruf: $letter2" + " type data: " + letter2::class.simpleName)
    println("--------------------")
    println("Tipe data String")
    var name: String = "Kotlin"
    var name2: String = "Java"
    println("Nama: $name" + " type data: " + name::class.simpleName)
    println("Nama: $name2" + " type data: " + name2::class.simpleName)
    println("--------------------")
    println("Tipe data Array")
    var array: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    var array2: Array<String> = arrayOf("Kotlin", "Java", "PHP", "Python")
    println("Array: $array")
    println("Array: $array2")
    println("--------------------")
    println("String Trim Margin")
    var text: String = """
        |Kotlin
        |Java
        |PHP
        |Python
    """.trimMargin()
    println(text)
    println("--------------------")
    println("String Template")
    var text2: String = "Kotlin"
    var text3: String = "Java"
    var text4: String = "PHP"
    println("Sebelum Template: ")
    println(text2)
    println(text3)
    println(text4)
    println("Setelah Template: ")
    var text5: String = "$text2 $text3 $text4"
    println(text5)
    println("--------------------")
    println("Tipe data Range")
    val range = 1..10
    val range2 = 10 downTo 1
    val range3 = 1..10 step 2
    val range4 = 10 downTo 1 step 2
    val range5 = 1 until 10
    println("Range: $range")
    println("Range: $range2")
    println("Range: $range3")
    println("Range: $range4")
    println("Range: $range5")
    println("--------------------")
}