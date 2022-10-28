package expression

fun toUpper(value: String): String = value.toUpperCase()

fun main(){

        //deklarasi lambda
        val lambdaName: (String) -> String =
            {it.toUpperCase()}

        //mengeksekusi lambda
        val name = lambdaName("Fahri Maulana")
        println(name)

        //deklarasi method reference
        val methodReference: (String) -> String =
            ::toUpper

        //mengeksekusi method reference
        val name2 = methodReference("Fahri Maulana")
        println(name2)
}