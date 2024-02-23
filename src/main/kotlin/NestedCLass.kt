fun main() {
// CLASS TYPES
    // 1. Nested class
    var daveGrohl = Musician()
    daveGrohl.desc()

    val guitar = Musician.Guitar()
    guitar.desc()

    val sax = Musician.sax()
    sax.desc()

    // 2.
    // 3.
}

class Musician {
    var style: String = "Rock"
    fun desc() = println("My style is: $style")

    class Guitar {
        var strings = 6
        fun desc() = println("Playing a guitar with $strings strings")
    }

    class sax {
        var family = "Saxophone soprano"
        fun desc() = println("Family: $family")
    }
}