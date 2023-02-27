import java.util.*

enum class Days {
    Monday, Tuesday, Wednesday,Thursday, Friday, Saturday, Sunday;
    fun NumDays() {
        println("Введите номер дня недели")
        var num = readLine()!!.toInt()
        while (true) {
            if(num > 0 && num <= 7){
                when {
                    (num == 1) -> println(Days.Monday)
                    (num == 2) -> println(Days.Tuesday)
                    (num == 3) -> println(Days.Wednesday)
                    (num == 4) -> println(Days.Thursday)
                    (num == 5) -> println(Days.Friday)
                    (num == 6) -> println(Days.Saturday)
                    (num == 7) -> println(Days.Sunday)
                }
                break
            }
            else {
                    println("Такого дня недели нет, попробуй ещё раз:")
                    num = readLine()!!.toInt()
                }
        }
    }
    fun Weekend() {
        println("Введите номер дня недели")
        var num = readLine()!!.toInt()
        while (true)
            if(num > 0 && num <= 7){
                when(num){
                    1 -> println("${Days.Monday} - Рабочий день")
                    2 -> println("${Days.Tuesday} - Рабочий день")
                    3 -> println("${Days.Wednesday} - Рабочий день")
                    4 -> println("${Days.Thursday} - Рабочий день")
                    5 -> println("${Days.Friday} - Рабочий день")
                    6 -> println("${Days.Saturday} - Выходной день")
                    7 -> println("${Days.Sunday} - Выходной день")
                }
                break
            }
            else{
                println("Такого дня недели нет.")
                num = readLine()!!.toInt()
            }
        }
    fun PastDay(day: Days): Days{
        val index = (day.ordinal - 1) % values().size
        println("Предыдущий день:")
        return values()[index]
    }
    fun RandomDay() : Days{
        println("Случайный день недели:")
        return values().random()
    }
}