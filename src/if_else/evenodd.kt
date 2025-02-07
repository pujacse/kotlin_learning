/* Write a Kotlin program that takes an integer as input and checks if the
number is even or odd using an if-else statement. */

fun main()
{
    println("Enter a number: ")

    val number = readLine()?.toIntOrNull()

    if(number != null)
    {
        if(number % 2 == 0)
        {
            println("$number is even")
        }
        else
        {
            println("$number is odd")
        }
    }
    else
    {
        println("Invalid input")
    }
}