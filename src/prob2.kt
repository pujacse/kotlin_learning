/*2. String Reversal
- Problem: Write a program that reverses a given string.
- Input 1: "Kotlin" → Output: "niltoK"
- Input 2: "Hello World" → Output: "dlroW olleH"*/

fun main()
{
    println("Enter your name: ")

    val name = readLine()?.toString()

    val reversed = StringBuilder(name).reverse()

    println("$reversed")
}