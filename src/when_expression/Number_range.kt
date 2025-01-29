
/* Write a Kotlin program that takes an integer and prints a message based on the range it falls into using a when expression:

Less than 0: "Negative number"
0 to 10: "Small number"
11 to 100: "Medium number"
Greater than 100: "Large number" */

fun main()
{
    println("Enter a number: ")
    val number = readLine()?.toIntOrNull() ?: 0

    val result = when
    {
        number < 0 -> "Negative number"
        number in 0..10 -> "Small number"
        number in 11..100 -> "Medium number"

        else -> "large number"
    }
    println("$result")

}