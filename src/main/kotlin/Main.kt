fun main() {
    //калькулятор объема параллелепипеда
    println("Вычислить объем параллелепипеда")
    print("введите значение длины в см: ")
    val length = readln().toDouble()
    print("введите значение ширины в см: ")
    val width = readln().toDouble()
    print("введите значение высоты в см: ")
    val height = readln().toDouble()
    val volume = length * width * height
    println("объем равен $volume куб.см")
}