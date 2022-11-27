fun main(args: Array<String>) {
    //калькулятор объема параллелепипеда
    println("Calculate the volume of the parallelepiped\n" +
            "Enter length")
    val length = readln().toInt()
    println("enter width")
    val width = readln().toInt()
    println("enter height")
    val height = readln().toInt()

    val volume = length * width * height
    println("Volume of the parallelepiped")
    println(volume)
}