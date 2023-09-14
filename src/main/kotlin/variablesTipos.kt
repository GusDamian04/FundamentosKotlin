fun main(){
    // Variables y Tipos de Datos Kotlin
    // val para constantes
    // var para variables

    val name = "Gustavo Damian"
    var age = 19
    print("Hi!, I´m $name and I'm $age")
    println("$age years old")

    //name = "Gus" las variables val no change (immutables)
    // age = 20
    // age = age + 15
    //age = "ten" Variables var change de valor pero no de type

    // Specify Type de Date en declaration

    // Declaration
    val city: String
    // Inicialización
    city = "Huamantla"

    // Delcaración inicialización
    val isMarried: Boolean = false

    val cars: Int = 1
    val height: Double = 1.57

    // String Templates
    // $ para imprimir valor de variables
    // ${} para pocesos antes de imprimir
    println("Hola soy $name y tengo $age años")
    println("Vivo en $city, tengo $cars carros")

    println("En 2030 tendre ${ cars + 2} 🚗")
}