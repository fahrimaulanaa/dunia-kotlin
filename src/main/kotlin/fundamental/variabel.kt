package fundamental

const val APP = "Kotlin"
const val VERSION = "1.0.0"
fun main(){
    println("--Kotlin variabel--")
    println()
    println("--------------------")
    println("Cara deklarasi variabel")
    println("1. var")
    println("2. val")
    var name: String = "Kotlin"
    var age: Int = 20
    var isMarried: Boolean = false
    println("Nama: $name")
    println("Umur: $age")
    println("Menikah: $isMarried")
    println("--------------------")
    println("Mutable variabel")
    println("Variabel yang bisa diubah nilainya adalah yang menggunakan var")
    var name2: String = "Kotlin"
    var age2: Int = 20
    var isMarried2: Boolean = false
    println("Sebelum dimutable:")
    println("Nama: $name2")
    println("Umur: $age2")
    println("Menikah: $isMarried2")
    println("--------------------")
    name2 = "Java"
    age2 = 21
    isMarried2 = true
    println("Setelah dimutable:")
    println("Nama: $name2")
    println("Umur: $age2")
    println("Menikah: $isMarried2")
    println("--------------------")
    println("Immutable variabel")
    println("Variabel yang tidak bisa diubah nilainya adalah yang menggunakan val")
    val name3: String = "Kotlin"
    val age3: Int = 20
    val isMarried3: Boolean = false
    println("Sebelum diimmutable:")
    println("Nama: $name3")
    println("Umur: $age3")
    println("Menikah: $isMarried3")
    println("--------------------")
    // name3 = "Java" // Error
    // age3 = 21 // Error
    // isMarried3 = true // Error
    println("Nullable variabel")
    println("Variabel yang bisa diisi null adalah yang menggunakan tanda tanya (?) setelah tipe data")
    var name4: String? = "Kotlin"
    var age4: Int? = 20
    var isMarried4: Boolean? = false
    println("Sebelum dinullable:")
    println("Nama: $name4")
    println("Umur: $age4")
    println("Menikah: $isMarried4")
    println("--------------------")
    name4 = null
    age4 = null
    isMarried4 = null
    println("Setelah dinullable:")
    println("Nama: $name4")
    println("Umur: $age4")
    println("Menikah: $isMarried4")
    println("--------------------")
    println("Constant variabel")
    println("Variabel constant adalah variabel yang nilainya tidak bisa diubah")
    println("Variable constant menggunakan kata kunci const dan diletakkan di luar fungsi")
    println("Nama aplikasi: $APP")
    println("Versi aplikasi: $VERSION")
    println("--------------------")
    println("Operasi Array")
    val member: Array<String> = arrayOf("Kotlin", "Java", "PHP", "Python")
    println("Jumlah member: ${member.size}")
    println("Semua member: ${member.contentToString()}")
    println("Member pertama: ${member[0]}")
    println("Member terakhir: ${member[member.size - 1]}")
    println("--------------------")
    println("Array Nullable")
    val member2: Array<String?> = arrayOfNulls(5)
    member2[0] = "Kotlin"
    member2[1] = null
    member2[2] = "PHP"
    member2[3] = null
    member2[4] = "Python"
    println("Jumlah member: ${member2.size}")
    println("Semua member: ${member2.contentToString()}")
    println("Member pertama: ${member2[0]}")
    println("Member terakhir: ${member2[member2.size - 1]}")
    println("--------------------")



}