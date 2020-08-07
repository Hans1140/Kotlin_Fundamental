import java.util.*

fun main(){
    print("nilai : ")
    val reader = Scanner(System.`in`)
    val nilai:Int = reader.nextInt()
    if (nilai >=75){
        println("nilai kamu $nilai, Selamat Ya ! ")
    }else if (nilai<=75){
        println("nilai kamu $nilai, Silahkan ikut Remedial ! ")
    }
}