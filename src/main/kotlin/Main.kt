fun main() {
    //калькулятор объема параллелепипеда
    println("Вычислить объем параллелепипеда\n" +
            "введите значение длины в см")
    val length = readln().toInt()
    println("введите значение ширины в см")
    val width = readln().toInt()
    println("введите значение высоты в см")
    val height = readln().toInt()
    val volume = length * width * height
    println("объем равен $volume кубических сантиметра")
}