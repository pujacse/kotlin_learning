fun main()
{
    println("Enter traffic light color: ")
    val color = readLine()

    if(color != null)
    {
        val result = when (color)
        {
            "red" -> "Stop"
            "yellow" -> "Get ready"
            "green" -> "Go"

            else -> "Invalid Input"
        }
        println("$result")
    }

    else
    {
        println("Invalid Input")
    }
}