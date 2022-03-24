import kotlin.math.*
fun main(args: Array<String>) {

    println("Pi: ${PI}\ne: ${E}")

    var varDouble = 2.72
    var roundResult: Int = round(varDouble).toInt()
    println("Pembulatan round $varDouble adalah " + roundResult)

    println("Nilai 2 pangkat 3 adalah " + 2.0.pow(3))

    println("Nilai 8 pangkat 1/3 adalah " + 8.0.pow((1.0 / 3.0)))

    val a = 5 / 2
    val b = 5.0 / 2
    val c = 5 / 2.0
    val d = 5.0 / 2.0

    print("$a\n$b\n$c\n$d")

}