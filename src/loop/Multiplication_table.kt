/* Write a Kotlin program that takes an integer n as input and uses
a for loop to print the multiplication table of n up to 10.*/

fun main()
{
    println("Enter a number: ")
    val n = readLine()?.toIntOrNull()

        if(n != null)
        {
            for(i in 1..10)
            {
                println("$n x $i = ${n * i}")
            }
        }
}