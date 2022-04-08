fun main() {
    /**
     * Hanya tipe data yg sama
     */

    val members: Array<String> = arrayOf("Elvin", "dwi", "hendrawan")
    println(members[0])

    // Change value
    members[2] = "Rio"
    println(members[2])

    // Nullable
    val clubs: Array<String?> = arrayOfNulls(10)
    println(clubs.get(0))
}