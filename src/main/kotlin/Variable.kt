const val APP = "Kotlin_Basic_001"
fun main() {
    /**
     * Mendukung 2 jenis variabel: Mutable (bisa diubah) dan Immutable (tidak bisa diubah)
     * Mut: var
     * Immut: val -> lebih direkomendasikan untuk constant value
     * Constant: immutable data yg bisa diakses scr global
     * Nullable -> tambahkan tanda tanya setelah tipedatanya
      */

    // Mutable
    var name: String = "Elvin";
    name = "Hendrawan";
    println(name)

    // Immutable
    val teacher = "Yadi";

    // Nullable
    var club: String? = null
    club = "Persib"
    println(club?.length)

    println("APP Name: $APP")
}