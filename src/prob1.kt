/*1. Sum Numbers
- Problem: Write a program that takes two integers as input and returns their sum.
- Input 1: 5, 3 → Output: 8
- Input 2: -4, 7 → Output: 3*/

fun main()
{
    println("Enter first number: ")
    val firstnumber  = readLine()?.toIntOrNull()

    println("Enter second number: ")
    val secondnumber = readLine()?.toIntOrNull()

    if(firstnumber != null && secondnumber != null)
    {
        val sum = firstnumber + secondnumber

        println("output: $sum")
    }
    else
    {
        println("Invalid input.")
    }

}
