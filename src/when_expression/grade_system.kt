/* Write a Kotlin program to take a percentage as input and assign a grade using a when expression:

A: Percentage >= 90
B: 80 <= Percentage < 90
C: 70 <= Percentage < 80
D: 60 <= Percentage < 70
F: Percentage < 60 */

fun main()
{
    println("Enter your percentage: ")
    val percentage = readLine()?.toIntOrNull()

    if(percentage != null)
    {
        val grade = when
        {
            percentage >= 90 -> "A"
            percentage in 80..89 -> "B"
            percentage in 70..79 -> "C"
            percentage in 60..69 -> "D"
            percentage < 60 -> "F"

            else -> "Invalid input"
        }
        println("Your grade is : $grade")
    }
    else
    {
        println("Invalid input. please try again.")
    }
}