fun main() {

    //Penggunaan short
    val simpsonsA = arrayOf("Homer", "Marge", "Bart", "Lisa", "Meggie") //deskripsi
    simpsonsA.sort() //perintah sort(ascending gak tau gimana descending)
    for (simpson in simpsonsA) {// luping untuk menghasilkan semua data
        print(simpson + ' ') // menampilkan data
    }
    print('\n')

    //Pengunaan sortedArray
    val simpsonsB: Array<String> = arrayOf("Homer", "Marge", "Bart", "Lisa", "Meggie") // deskripsi
    val simpsons_sorted = simpsonsB.sortedArray()// perintak short khusus untuk array(maybe)
    for (simpson in simpsons_sorted) {// luping untuk menghasilkan semua data
        print(simpson + ' ')// menampilkan data
    }
    print('\n')

    //Pengunaan reverse metode
    val simpsonsC: Array<String> = arrayOf("Homer", "Marge", "Bart", "Lisa", "Meggie") //deskripsi
    simpsonsC.sort()// diurutkan dulu
    simpsonsC.reverse()// baru dibalikan
    for (simpson in simpsonsC) {// luping
        print(simpson + ' ')// menampilkan data
    }
    print('\n')

    //penggunaan index of
    val simpsonsD = arrayOf("Homer", "Marge", "Bart", "Lisa", "Meggie") //deskripsi
    val simpson = "Lisa" // variable
    val position = simpsonsD.indexOf(simpson) // membuat variable baru kemudian dicari index dari variable simson keberepa kemudian dicocokan dengan array
    if (position != -1) { // pembuatan kondisi jika posision daru simpson tadi tidak sama dengan -1 maka dilakukan perintah
        println("Yeah, that's my number ${position + 1} Simpson!")// hasil dari penemuan kondisi diline ke 31 ditambah 1
    } else {
        println("Hey that's not Simpson!")// kemungkinan lain jika posisinya = -1
    }

    //pengunaaan metode is empty,first,last,contain
    val simpsonsE = arrayOf("Homer", "Marge", "Bart", "Lisa", "Meggie")//deskripsi
    println("simpsons size: " + simpsonsE.size)// jumblah dari array
    if(!simpsonsE.isEmpty())// pernyataan jika simsone tidak kosong
        println("Array tidak kosong!")//menampilkan data
    println("Min = "+ simpsonsE.minOrNull())//menampilkan data tersikit
    println("Max = "+ simpsonsE.maxOrNull())//menampilkan data terbanyak
    println("First = " + simpsonsE.first())// menampilkan data pertama
    println("Last = " + simpsonsE.last())// menampilkan data terakhir
    println(simpsonsE.contains("Marge"))// pembuktian adakah variable "marge" didalam array
}

