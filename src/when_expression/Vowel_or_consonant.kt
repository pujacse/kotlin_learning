/*Write a Kotlin program to check whether a given character is a
vowel or a consonant using a when expression.*/

fun main()
{
    println("Enter a character: ")
    val input = readLine()

    if(input != null && input.length == 1)
    {
        val character = input[0].lowercaseChar()

        val result = when (character)
        {
            'a','e','i','o','u' -> "vowel"
            in 'a'..'z' -> "consonant"
            else -> "Invalid Input"
        }
        println("$input is a $result")
    }
    else
    {
        println("Invalid input")
    }
}