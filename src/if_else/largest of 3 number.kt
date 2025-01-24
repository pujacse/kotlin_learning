/* Write a Kotlin program to find the largest number among
three given numbers using a nested if statement. */

fun main()
{
    println("Enter three numbers: ")
    val number1 = readLine()?.toIntOrNull()
    val number2 = readLine()?.toIntOrNull()
    val number3 = readLine()?.toIntOrNull()

    if(number1 != null && number2 != null && number3 != null)
    {
        var largestNumber = number1

        if(number2 > largestNumber)
        {
            largestNumber = number2
        }
        if(number3 > largestNumber)
        {
            largestNumber = number3
        }

        println("The largest number is $largestNumber")
    }
    else
    {
        println("Invalid input")
    }
}