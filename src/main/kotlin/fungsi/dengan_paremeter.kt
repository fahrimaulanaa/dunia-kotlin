package fungsi

fun sayHello(name: String){
    println("Hello $name")
}

fun animal(name: String, age: Int){
    println("Nama hewan: $name")
    println("Umur hewan: $age")
    println("--------------------")
}

fun main() {
    println("Parameter berfungsi untuk mengirimkan data ke dalam fungsi")
    sayHello("Kotlin")
    sayHello("Java")
    sayHello("Python")
    println("--------------------")
    println("Parameter bisa lebih dari satu")
    animal("Kucing", 2)
    animal("Anjing", 3)
    animal("Burung", 1)

}