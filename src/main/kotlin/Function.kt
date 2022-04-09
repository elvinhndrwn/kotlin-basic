fun main() {
//    sayHello("Elvin")
//    sayNumber(100)
//    named(last = "hoho", first = "Hihi")

    println(car())
    println(perkalian(5,10))
}

fun sayHello(name:String){
    println("Hello $name")
}

// With default parameter
fun sayNumber(number: Int? = null){
    println(number)
}

// Named Argument
fun named(first: String, last: String){
    println("$first $last")
}

// Return type
fun car(): String{
    return "Brio"
}

// Single expression
fun perkalian(angka1: Int, angka2: Int) = angka1*angka2
