fun main(){
    // 9. Map of student scores
    val studentScores = mapOf("Nasir" to 85, "Tunde" to 60, "Ishaq" to 92, "Kabir" to 75)
    println("Students who scored above 70:")
    for ((name, score) in studentScores) {
        if (score > 70) {
            println("$name: $score")
        }
    }
    println("\n---")


}