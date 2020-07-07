import java.util.*
import kotlin.collections.ArrayList

fun main() {
    println("----------------------")
    println("-Silahkan Pilih Materi-")
    println("----------------------")

    println("1. Implementasi Array")
    println("2. Implementasi LinkedList")
    println("3. Implementasi ArrayList")
    println("4. Implementasi List dengan ArrayList")

    print("Pilihan Anda: ")
    val checkUserInput = readLine()!!

    val namaAnggotaBinarAndroid = arrayOf("Andra","Wisnu","Abrar","Alfi","Andi","Andri","Hanif","Nanda","Johan","Senno")

    if(checkUserInput == "1"){
//        val namaAnggotaBinarAndroid = arrayOf("Andra","Wisnu","Abrar","Alfi","Andi","Andri","Hanif","Nanda","Johan","Senno")
        for(element in namaAnggotaBinarAndroid){
            println(element)

        }

        println("Balik ke pilihan?(ya/tidak)")
        val checkingInput = readLine()!!
        if(checkingInput == "ya"){
            return main()
        }else{
            println("Terima Kasih")
        }

    }else if(checkUserInput == "2"){
        val usingLinkedList = LinkedList<String>()
        usingLinkedList.add("Andra")
        usingLinkedList.add("Wisnu")
        usingLinkedList.add("Abrar")
        usingLinkedList.add("Alfi")
        usingLinkedList.add("Andi")
        usingLinkedList.add("Andri")
        usingLinkedList.add("Hanif")
        usingLinkedList.add("Nanda")
        usingLinkedList.add("Johan")
        usingLinkedList.add("Senno")

        println("$usingLinkedList")

        println("Balik ke pilihan?(ya/tidak)")
        val checkingInput = readLine()!!
        if(checkingInput == "ya"){
            return main()
        }else{
            println("Terima Kasih")
        }
//        usingLinkedList.add(namaAnggotaBinarAndroid[])
    }else if(checkUserInput == "3"){
        val usingArrayList = ArrayList<String>()
        usingArrayList.add("Andra")
        usingArrayList.add("Wisnu")
        usingArrayList.add("Abrar")
        usingArrayList.add("Alfi")
        usingArrayList.add("Andi")
        usingArrayList.add("Andri")
        usingArrayList.add("Hanif")
        usingArrayList.add("Nanda")
        usingArrayList.add("Johan")
        usingArrayList.add("Senno")

        println("$usingArrayList")

        println("Balik ke pilihan?(ya/tidak)")
        val checkingInput = readLine()!!
        if(checkingInput == "ya"){
            return main()
        }else{
            println("Terima Kasih")
        }
    }else if(checkUserInput == "4"){
        val sebuahArray:List<String> = arrayListOf("Andra","Wisnu","Abrar","Alfi","Andi","Andri","Hanif","Nanda","Johan","Senno")
        println("$sebuahArray")

        println("Balik ke pilihan?(ya/tidak)")
        val checkingInput = readLine()!!
        if(checkingInput == "ya"){
            return main()
        }else{
            println("Terima Kasih")
        }
    }else{
        print("Inputan Anda Salah")
    }
}