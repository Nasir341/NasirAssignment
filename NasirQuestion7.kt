fun main(){
    // 7. Car class
    class Car(val brand: String, val model: String, val year: Int) {
        fun displayDetails() {
            println("Brand: $brand, Model: $model, Year: $year")
        }
    }
    val car1 = Car("Hyundai", "elantra", 2012)
    val car2 = Car("Cardillac", "Escalade", 2025)
    car1.displayDetails()
    car2.displayDetails()

    println("\n---")

}