/* Write a Kotlin program that takes a percentage as input and assigns a grade
using the following criteria:

A: Percentage >= 90
B: 80 <= Percentage < 90
C: 70 <= Percentage < 80
D: 60 <= Percentage < 70
F: Percentage < 60
Use a nested if-else to determine the grade. */

fun main()
{
    println("Enter your percentage: ")
    val percentage = readLine()?.toFloatOrNull()

    if(percentage != null)
    {
        if(percentage >= 90)
        {
            println("Your grade is A")
        }
        else if(percentage >= 80 )
        {
            println("Your grade is B")
        }
        else if(percentage >= 70)
        {
            println("Your grade is C")
        }
        else if(percentage >= 60)
        {
            print("Your grade is D")
        }
        else if(percentage < 60)
        {
            println("Your grade is F ")
        }
        else
        {
            println("Invalid input")
        }
    }
    else
    {
        println("Invalid")
    }
}