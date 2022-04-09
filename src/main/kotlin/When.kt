fun main() {
    /**
     * biasanya digunakan untuk pengecekan kondisi satu variable yg sederhana
     */

    val finalExam = "E"
    when (finalExam){
        "A" -> println("Amazing")
        "B" -> {
            println("Good job")
        }
        "D", "E" -> println("Hahahahah")
        else -> println("Try again later")
    }

    /**
     * When expression in
     */

    val nilai = "A"
    val nilaiLulus: Array<String> = arrayOf("A", "B", "C")
    when(nilai){
        in nilaiLulus -> println("SELAMAT ANDA LULUS")
        !in nilaiLulus -> println("TIDAK LULUS")
    }

    /**
     * Sebagai if else
     */

    val nomor = 20
    when{
        nomor > 10 -> println("Aman")
        nomor > 25 -> println("Terlewat")
        else -> println("system error")
    }
}