package fungsi

fun finalValue(name: String, vararg values: Int) {
    var total = 0.0
    for (value in values) {
        total += value
    }
    val finalValue = if (values.size == 0) 0.0 else total / values.size
    println("Final value $name adalah $finalValue")

}

fun main(){
    finalValue("Kotlin", 10, 10, 10, 10)
    finalValue("Android", 90, 80, 100, 85)
    finalValue("Java")
}