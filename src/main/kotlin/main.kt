fun main() {
    val likes = 22 // количество лайков
    val ending = if (likes % 10 == 1 && likes % 100 != 11) "человеку" else "людям" // вычисление окончания слова
    println("Понравилось $likes $ending") // вывод результата
}