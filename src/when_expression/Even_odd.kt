/* Write a Kotlin program to check whether a given number is even or odd using a
when expression. Instead of using direct conditions, use the modulus operator and ranges within when. */

fun main()
{
    println("Enter a number: ")
    val number = readLine()

    if(number != null)
    {
        val result = when (number)
        {
            "number % 2 == 0" -> "Even"

            else -> "Odd"
        }
        println("$number is $result")
    }
    else
    {
        println("Invalid Input")
    }
}