package oop

class Car {
    var merk = ""
    var color = ""
    var year: Int = 0
}

fun main() {
    var car1 = Car()
    car1.merk = "Honda brio"
    car1.color = "White"
    car1.year = 2015

    println(car1.merk)
}