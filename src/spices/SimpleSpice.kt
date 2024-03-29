package spices

class SimpleSpice {
    val name: String = "curry"
    val spiciness: String = "mild"
    val heat: Int
        get()= 5
}

class Spice(val name: String, val spiciness: String = "mild"){
    val heat: Int
        get() {
            return when (spiciness) {
                "mild" -> 1
                "medium" -> 3
                "spicy" -> 5
                "very spicy" -> 7
                "extremely spicy" -> 10
                else -> 0
            }
        }
    init {
        println("$name / $spiciness / $heat")
    }
}

fun makeSalt() = Spice("salt")