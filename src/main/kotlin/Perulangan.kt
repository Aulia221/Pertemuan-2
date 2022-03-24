fun main() {
//The for loop
    for (i in 1..10) {
        print("$i ")
    }
    print('\n')
    print('\n')
    val arrInt = arrayOf(1, 2, 3, 4)
    for (i in arrInt) println("values of the array " +i)

    print('\n')
    val IistInt = listOf(1, 22, 83, 4)
    for ((index, value) in IistInt.withIndex()) {
    println("the element at $index is $value")
    }
}