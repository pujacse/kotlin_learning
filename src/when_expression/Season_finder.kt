/* Write a Kotlin program that takes a month (1 to 12) as input and determines the season:

Spring: March to May
Summer: June to August
Autumn: September to November
Winter: December to February */

fun main()
{
    println("Enter the month number (1-12): ")
    val month = readLine()?.toIntOrNull()

    if(month in 1..12)
    {
        val result = when (month)
        {
            in 3..5 -> "Spring"
            in 6..8 -> "Summer"
            in 9..1 -> "Autumn"
            in 1..2, 12 -> "Winter"

            else -> "Invalid Input"
        }
        println("$result")
    }
    else
    {
        println("Invalid Input")
    }
}