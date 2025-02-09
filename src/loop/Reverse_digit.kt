fun main() {
    print("Enter a number: ")
    val num = readLine()?.toIntOrNull() ?: return  // Read input and handle null case
    var originalNum = num
    var reversedNum = 0

    while (originalNum > 0) {
        val digit = originalNum % 10  // Get the last digit
        reversedNum = reversedNum * 10 + digit  // Append digit to reversed number
        originalNum /= 10  // Remove last digit
    }

    println("Reversed number: $reversedNum")
}
