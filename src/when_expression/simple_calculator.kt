/*Write a Kotlin program that takes two numbers and an operator (+, -, *, /) as input.
Use a when expression to perform the corresponding operation and display the result.*/

fun main()
{
    println("Enter first number: ")
    val firstNumber = readLine()?.toIntOrNull()?: 0

    println("Enter second number: ")
    val secondNumber = readLine()?.toIntOrNull()?: 0

    println("Enter operator (+, -, *, /): ")
    val operator = readLine()

    val result = when (operator)
    {
        "+" -> firstNumber + secondNumber
        "-" -> firstNumber - secondNumber
        "*" -> firstNumber * secondNumber
        "/" -> if ( secondNumber != 0) firstNumber / secondNumber else "Error: Division by zero"
        else -> "Invalid operator"
    }
    println("Result: $result")
}