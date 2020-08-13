import java.util.*

fun main() {
    print("nilai : ")
    val skor = 100
    var nilai = ""
    if (skor >90 && skor <=100) nilai = "A"
    else if (skor >80 && skor <=90)nilai = "B"
    else if (skor >70 && skor <= 80) nilai = "C"
    else if (skor >60 && skor <= 70) nilai = "D"
    else if (skor >50 && skor <= 60) nilai = "E"
    else nilai = "tidak dapat didefinisikan "
    print("selamat ya.. skor kamu $skor (nilai $nilai")

}