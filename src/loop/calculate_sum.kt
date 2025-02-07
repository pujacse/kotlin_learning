/*Write a Kotlin program that uses a for loop to find the
sum of all even numbers from 1 to 50.*/

fun main() {
    var sum = 0

    for (num in 2..50 step 2) {
        sum += num
    }

    println("Sum of even numbers from 1 to 50 is: $sum")
}
