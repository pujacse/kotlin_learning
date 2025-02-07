package loop

fun main()
{
    var sum = 0

    for(num in 1..50 step 2)
    {
        sum += num
    }

    println("sum number: $sum")
}