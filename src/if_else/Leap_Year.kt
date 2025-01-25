/* Write a Kotlin program to check whether a given year is a leap year or not.
Use a nested if statement.

Conditions for a leap year:

1. The year is divisible by 4.
2. If the year is divisible by 100, it must also be divisible by 400. */

fun main()
{
    println("Enter a year: ")
    val year = readLine()?.toIntOrNull()

    if(year == null)
        return

    if(year % 4 == 0)
    {
        if(year %100 ==0)
        {
            if(year %400 == 0)
                println("$year is a Leap year")
            else
            {
                println("$year is a Common year")
            }
        }
        if(year % 100 != 0)
            println("$year is a Leap year")
    }
    else
    {
        println("$year is a Common year")
    }
}