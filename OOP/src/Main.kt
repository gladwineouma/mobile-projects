fun main() {
//    var car = Car("Nissan", "Leaf", "KDA 379G", 0)
//    car.start()
//    println(car.speed)
//    car.accelerate(30)
//    println(car.speed)
////    car.decelerate(deceleration: 22)
//    car.stop()
//
//
//    val benz = Car("benz", "e3434", "KDQ5", 23)
//
//    val book1 = Book("Becoming","Mitchelle Obama", 230, 2309.800)
//    val Book2= Book("Trevor Noah","Trevor Noah",307,234.450)
   val res =  finMinMaxAve(arrayOf(43,56,78,56,67,34,78,99))
    println(res)
    res.min
    res.max
    res.average
}

//class Car(var make: String, var model: String, var registration:
//String, var speed: Int) {
//    public fun start() {
//        println("chchchchchhhhch vroom")
//    }
//
//    public fun accelerate(acceleration: Int): Int {
//        speed = speed + acceleration
//        return speed
//    }
//
//    fun hoot() {
//        println("heep heep")
//    }

//    fun decelerate(deceleration: Int) {
//        speed -= deceleration
//
//    }
//
//    fun stop() {
//        speed = 0
//        println("The car has stopped")
//    }
//}

//    data class Book(
//        var title: String,
//        var author: String,
//        var pages: Int,
//        var price: Double,
//    )
//write a function from an integer array returns the minimum valu, max value and average val
data class Statistics(val min: Int, val max:Int, val average:Double)

fun finMinMaxAve(nums:Array<Int>): Statistics {
    val maximum = nums.max()
    val minimum = nums.min()
    val average = nums.average()
    val stats = Statistics(minimum,maximum,average)
    return stats
}

//I have many friends in my friends group. I want to find out
//who has the longest and shortest name and return both
// values from the function

data class Namelength(val shortest: String, val lomgest:String)
fun findNameLength(names:Array<String>) {
    val longest  = names.maxByOrNull { it.length }?:""

}
fun lOngAndShort(names: Array<String>): NamesData{
    val shortest = names[0]
    val longest = names[0]
    for (name in names){
        if (name.length<shortest.length)
    }

}









