class Calculator() {
    // Private keyword changes the visibility of a variable or function. Like in java they can only be accessed or modified inside the class
    private var number1 = 0
    private var number2 = 0
    private var result = 0
    private val addOperator: Char = '+'
    private val subOperator: Char = '-'
    private val mulOperator: Char = '*'
    private val divOperator: Char = '/'
    private val equalOperator: Char = '='

    fun calculate(num1: Int, operator: Char, num2: Int) {
        println("Calculating...")
        calc(num1, operator, num2)
    }

    private fun calc(num1: Int, operator: Char, num2: Int) {
        number1 = num1
        number2 = num2

        when (operator) {
            '+' -> addition()
            '-' -> subtraction()
            '*' -> multiplication()
            '/' -> division()
            else -> println("INVALID OPERATOR!")
        }
    }

    private fun addition() {
        result = number1 + number2
        println("$number1 $addOperator $number2 $equalOperator $result")
    }

    private fun subtraction() {
        result = number1 - number2

        println("$number1 $subOperator $number2 $equalOperator $result")
    }

    private fun multiplication() {
        result = number1 * number2

        println("$number1 $mulOperator $number2 $equalOperator $result")
    }

    private fun division() {
        result = number1 / number2

        if (number1 % 2 == 0 && number2 % 2 == 0) {
            println("$number1 $divOperator $number2 $equalOperator $result")
        } else {
            val res = number1.toDouble() / number2.toDouble()
            println("$number1 $divOperator $number2 $equalOperator $res")
        }
    }
}