fun main() {
    /**
     * Break -> menghentikan seluruh perulangan
     * Continue -> menghentikan perulangan yang berjalan dan langsung menlanjutkan ke perulangan selanjutnya
     */

    var nomor = 1
    while (nomor <= 20){
        println("Nomor ke $nomor")
        nomor++

        if (nomor == 15) break
    }

    // Continue
    for (nomor in 1..20){
        if(nomor % 2 == 0) continue
        println(nomor)
    }
}