fun main(){
    println("С каким классом хотите работать (Color/Day)")
    var text = readLine()!!.toString()
    while (true){
        if( text == "Color" || text == "Day") break
        else{
            println("Попробуй ещё раз")
            text = readLine()!!.toString()
        }
    }
    when(text){
        "Color" -> {
            var Color: ColorsType = ColorsType.RED
            Color.NumColors()
            println(Color.RandomColor())
            println(Color.AllColors())
        }
        "Day" -> {
            var Day: Days = Days.Friday
            Day.NumDays()
            Day.Weekend()
            println(Day.PastDay(Day))
            println(Day.RandomDay())
        }
    }


}