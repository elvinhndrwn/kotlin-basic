package oop

open class Pabrik(){
    var name = ""
}

class Motor: Pabrik(){
    var model = ""
}

fun createMotor(): Motor {
    val motor1 = Motor()
    motor1.name = "Honda"
    motor1.model = "Vario"

    return motor1
}
fun main() {
    println(createMotor().model)
}