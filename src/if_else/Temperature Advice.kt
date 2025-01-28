/*Write a Kotlin program that takes the temperature as
input and provides advice using a nested if statement:

Temperature > 30: "It's too hot, stay hydrated!"
20 <= Temperature <= 30: "The weather is pleasant."
Temperature < 20: "It's cold, wear warm clothes." */

fun main()
{
    println("Enter the temperature: ")
    val temperature = readLine()?.toIntOrNull()

    if(temperature != null)
    {
        if(temperature > 30)
        {
            println("It`s too hot, stay hydrated!")
        }
        else if(temperature in 20..30 )
        {
            println("The weather is pleasant.")
        }
        else if(temperature < 20)
        {
            println("it`s cold, wear warm clothes." )
        }
        else
        {
            println("nothing")
        }
    }
    else
    {
        println("Invalid error")
    }
}