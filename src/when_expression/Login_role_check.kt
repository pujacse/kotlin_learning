
/* Write a Kotlin program that checks the role of a user (admin, editor, viewer) using a when expression and displays the permissions:

Admin: "Full access"
Editor: "Edit access only"
Viewer: "Read-only access" */

fun main()
{
    println("Enter your role: ")
    val role = readLine()

    val result = when(role)
    {
        "Admin" -> "Full access"
        "Editor" -> "edit access only"
        "Viewer" -> "Read-only access"

        else -> "Invalid input"
    }
    println("$result")
}