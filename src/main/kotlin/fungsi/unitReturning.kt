package fungsi

fun printName(name: String?): Unit {
    if (name == null) {
        println("Nama tidak boleh kosong")
    } else {
        println("Nama saya adalah $name")
    }
}

fun main() {
    printName(null)
    printName("Kotlin")
}
