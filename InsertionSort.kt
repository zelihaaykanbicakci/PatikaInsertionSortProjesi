fun main() {
    val dizi = mutableListOf(22, 27, 16, 2, 18, 6)
    println("Başlangıç: $dizi")

    for (i in 1 until dizi.size) {
        val anahtar = dizi[i]
        var j = i - 1
        
        while (j >= 0 && dizi[j] > anahtar) {
            dizi[j + 1] = dizi[j]
            j--
        }
        dizi[j + 1] = anahtar
        println("${i}. Adım sonucu: $dizi")
    }
}