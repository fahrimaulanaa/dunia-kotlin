package expression

fun main(){
    loopI@ for (i in 1..10){
        loopJ@ for (j in 1..10){
            println("$i x $j = ${i * j}")
            if(j == 10){
                continue@loopI
            }
        }
    }
}