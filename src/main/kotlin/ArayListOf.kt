fun main () {
    //Array List (mutable) bisa diubah
    /*
    Method :
    clear(), contains(), size, get() or [], add(), or +=, remove() or -=,
    removeAt(), toTypeArray(), LastIndexOf(), removeAll(), reverse()
     */

    val arrayList = arrayListOf(1, 2, 3)
    print("ArrayList aray :")
    for(item in arrayList) {
        print("$item")
    }
    print("\n")

    arrayList += 9

    print("Tambahkan elemen 9 dalam arrayList :")
    println(arrayList)

    arrayList.reverse()
    println("Reverse arrayList: ")
    println(arrayList)

    arrayList -= 1
    print("Remove last element in arrayList: ")
    println(arrayList)

    arrayList += (1..5)
    print("Add range in arrayList: ")
    println(arrayList)
}