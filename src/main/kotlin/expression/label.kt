package expression

fun main(){
    loop@ for (i in 1..100){
        for (j in 1..100){
            if (i > 10) break@loop
            println("i: $i, j: $j")
        }
    }
}