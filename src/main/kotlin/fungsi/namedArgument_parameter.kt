package fungsi

fun fullName(firstName: String,
             middleName: String,
             lastName: String){
    println("Hello $firstName $middleName $lastName")
}

fun main(){
    fullName(firstName = "Kotlin",
        middleName = "Developer",
        lastName = "Android")
}