package oop

class Person{
    var name = ""
    fun introduce(){
        println("Hello my name is ${this.name}")
    }
}
fun main() {
    val p1 = Person()
    p1.name = "Elvin Dwi Hendrawan"

    println(p1.introduce())
}