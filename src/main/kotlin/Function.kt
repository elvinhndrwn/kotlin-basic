fun main() {
    sayHello("Elvin")
    sayNumber(100)
    named(last = "hoho", first = "Hihi")
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