fun main()
{
    println("Enter a number(1-12): ")
    val number = readLine()?.toIntOrNull()

    if(number != null)
    {
        val result = when (number)
        {
            1 -> "January"
            2 -> "February"
            3 -> "March"
            4 -> "April"
            5 -> "May"
            6 -> "June"
            7 -> "July"
            8 -> "August"
            9 -> "September"
            10 -> "October"
            11 -> "November"
            12 -> "December"

            else -> "Invlid Input"
        }
        println("$result")
    }

    else("Invalid input")

}
