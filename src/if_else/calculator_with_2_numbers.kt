fun main()
{
    println("Enter first number: ")
    val firstNumber = readLine()?.toDoubleOrNull()

    println("Enter second number:")
    val secondNumber = readLine()?.toDoubleOrNull()
    if(firstNumber == null || secondNumber == null)
        return

    println("Enter operator (+, -, *, /): ")
    val operator = readLine()

    val result = when (operator)
    {
        "+" -> firstNumber + secondNumber
        "-" -> firstNumber - secondNumber
        "*" -> firstNumber * secondNumber
        "/" -> if(secondNumber != 0.00)
        {
            firstNumber / secondNumber
        }
        else
        {
            println("Error: Division by zero! ")
            return
        }
        else ->
        {
            println("Invalid operator.")
            return
        }
    }
    println("The $firstNumber $operator $secondNumber is : $result ")
}