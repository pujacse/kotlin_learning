/*Write a Kotlin program that takes an integer (1 to 7) as input and prints the corresponding day
of the week using a when expression.*/

fun main()
{
    println("Enter a number (1-7): ")
    val number = readLine()?.toIntOrNull()

    if(number != null)
    {
        val day = when (number)
        {
            1 -> "Monday"
            2 -> "Tuesday"
            3 -> "Wednesday"
            4 -> "Thursday"
            5 -> "Friday"
            6 -> "Saturday"
            7 -> "Sunday"
            else -> "Invalid input"
        }
        println("$day")
    }
    else
    {
        println{"Invalid input. please inter a valid number"}
    }
}