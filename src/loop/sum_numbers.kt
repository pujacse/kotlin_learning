/* Write a program to calculate the sum of the first n natural numbers using a while loop.*/

fun main() {
    print("Enter a positive integer: ")
    val n = readLine()?.toIntOrNull() ?: 0

    if (n <= 0) {
        println("Please enter a valid integer number .")
        return
    }

    var sum = 0
    var i = 1

    while (i <= n) {
        sum += i
        i++
    }

    println("The sum of the first $n natural numbers is: $sum")
}
