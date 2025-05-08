fun main() {
    // 2. Get name and age, then print a greeting
    print("Enter your name: ")
    val userName = readlnOrNull()
    print("Enter your age: ")
    val userAgeStr = readlnOrNull()
    if (userName != null && userAgeStr != null) {
        val userAge = userAgeStr.toIntOrNull()
        if (userAge != null) {
            println("Hello $userName, you are $userAge years old!")
        } else {
            println("Invalid age input.")
        }
    } else {
        println("Name or age input was null.")
    }

    println("\n---")
}