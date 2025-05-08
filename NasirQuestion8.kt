fun main(){
    // 8. Person and Student classes
    open class Person(val name: String, val age: Int) {
        fun printPersonDetails() {
            println("Name: $name, Age: $age")
        }
    }
    class Student(name: String, age: Int, val grade: Char) : Person(name, age) {
        fun printStudentDetails() {
            printPersonDetails()
            println("Grade: $grade")
        }
    }
    val student1 = Student("Nasir", 20, 'A')
    student1.printStudentDetails()

    println("\n---")

}