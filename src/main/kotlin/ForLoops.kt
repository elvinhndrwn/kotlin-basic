fun main() {
    /**
     * Gunakan kata kunci in
     */

    var names: Array<String> = arrayOf("Elvin", "Dasir", "Mustam", "Muslik")
    for (name in names){
        println(name)
    }

    //println(names.size)

    /**
     * For range
     */

    //for (i in 1..10) println(i)
    val lenNames = names.size-1;
    for (i in 0..lenNames){
        println("Index $i = ${names.get(i)}")
    }
}