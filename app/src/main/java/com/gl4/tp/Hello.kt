package com.gl4.tp

fun main(argv : Array<String>) {
    print("Hello")

    /*var message: String? = "My message can possibly be null !"
    message?.uppercase()
    */
    /*/**Activity*/
    var hello = "Hello"
    hello = "Hello world!"

    println(hello)

    var toto = "Toto"

    println(toto)

    var message: String? = "I’m learning Kotlin!"
    message = null
    println(message?.toString())

    /**Activity*/
    fun Sum(a: Double, b: Double) = a + b

    var name: String = "this is a string"
    fun sayMyName() {
        println(" $name ")
    }

    fun sayHello() = "Hello"
*/

    var rec = arrayOf( Rectangle() , Rectangle( q=Point(3,5)) , Rectangle( p=Point(6,2)) ,Rectangle( Point(1,6) , Point(6,9)))

    println()
    println("les surfaces des rectangles : ")
    for (k in 0 until rec.size){
        println(rec[k].surface())
    }
}

/*
/**Activity*/
// Complétez la fonction pour afficher les éléments de la liste
fun showList(list: List<String>) {
    for (k in 0 until list.size) {
        println(list[k])
    }
}

// Complétez la fonction pour afficher les nombres impairs jusqu'à 10
fun oddNumbersTo10(){
    for (k in 1 until 10 step 2){
        println(k)
    }
}

// Créez une liste ordonnée de plusieurs languages de programation
private val languages = listOf("C", "Java","Kotlin")
fun main(args: Array<String>) {
    println("Languages :")
    showList(languages)
    println("Odd Numbers to 10 :")
    oddNumbersTo10()

}

/**Activity*/
fun operateur2entiers(a:Int , b :Int , Op :String): Int? {
    when(Op){
        "+" -> return a+b
        "-" -> return a-b
        "/" -> return a/b
        "*" -> return a*b
        "%" -> return a%b
        else -> return null
    }
}

 */
