fun main(){
    val car = Car("Subari", 40.00)
    val lorry = Lorry("Isuzu", 70.00)
    var motorbike = Motorbike("Honda", 30.00)
    println(car.rentalCost(5))
    println(lorry.rentalCost(5))
    println(motorbike.rentalCost(5))


}

open class Vehicle( val make: String, val rentCost : Double){
    open fun  rentalCost(days:Int): Double{
        return rentCost*days
    }
}
class Car(make: String, rentCost: Double):Vehicle(make,rentCost){
    override fun rentalCost(days: Int): Double {
        return rentCost*days
    }
}
class Lorry(make: String, rentCost: Double):Vehicle(make,rentCost){
    override fun rentalCost(days: Int): Double {
        val bigLoad = 40.00
        return rentCost* days + bigLoad
    }
}
class Motorbike(make: String, rentCost: Double): Vehicle(make,rentCost){
    override fun rentalCost(days: Int): Double{
        val smallLoad = 20
        return rentCost*days-smallLoad
    }
}

open class Employee(val name: String, val salary: Double){
     open fun calaculatePayment(hours: Int): Double{
        return salary * hours
     }
}
class fUllTimeEmplyee(name: String,salary: Double): Employee(name,salary){
    override fun calaculatePayment(hours: Int): Double {
        return salary * hours
    }
}

class partTimeEmployee(name: String,salary: Double): Employee(name,salary){
    override fun calaculatePayment(hours: Int): Double {
        return salary * hours
    }
}
class contructor(name: String,salary: Double): Employee(name,salary){
    override fun calaculatePayment(hours: Int): Double {
        return salary * hours
    }
}

