fun main() {
    val calculator = Calculator()
    println("Humble Calculator App")
    calculator.calculate(7200, '+', 6528)
    calculator.calculate(500, '-', 33)
    calculator.calculate(55, '*', 72)
    calculator.calculate(60000, '/', 22)
    calculator.calculate(60000, '|', 22)
}