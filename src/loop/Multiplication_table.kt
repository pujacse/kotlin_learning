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