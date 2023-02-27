import java.util.*

enum class ColorsType {
    RED, ORANGE, YELLOW, GREEN, BABYBLUE, BLUE, VIOLET;

    fun NumColors(){
        println("Введите какой цвет радуги ходите от 1 до 7:")
        var num = readLine()!!.toInt()
        while (true){
            if(num >= 0 && num <= 7)
            {
                when{
                    (num == 1) -> println(ColorsType.RED)
                    (num == 2) -> println(ColorsType.ORANGE)
                    (num == 3) -> println(ColorsType.YELLOW)
                    (num == 4) -> println(ColorsType.GREEN)
                    (num == 5) -> println(ColorsType.BABYBLUE)
                    (num == 6) -> println(ColorsType.BLUE)
                    (num == 7) -> println(ColorsType.VIOLET)
                }
                break
            }
            else {
                println("Такого цвета радуги нет, попробуй ещё раз:")
                num = readLine()!!.toInt()
            }
        }
    }
    fun RandomColor():ColorsType {
        println("Случайный цвет")
        return values().random()
    }
    fun AllColors() : List<ColorsType>{
        println("Цвета радуги:")
        return values().toList()
    }

}