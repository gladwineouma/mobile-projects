import kotlin.time.times

fun main() {
val banker = Banker("Joan", 42)
    banker.talk("Hello, what is your account number?")
    banker.sleep()
    banker.eat()
    println( banker.countMoney(arrayOf(100,1000,500,200,50,1000)))


    val doctor = Doctor("Mary", 30,)
    doctor.talk("How are you feeling today")
    doctor.sleep()
    doctor.eat()
    doctor.treatPatient("Kamau","headache")


    val farmer =Farmer("James",43)
    farmer.talk("It is planting season")
    farmer.sleep()
    farmer.eat()
    farmer.cultivateanLd()
    farmer.vote()
    farmer.payTaxes()
    farmer.protest()

    val car = Car("mazda","CX5","Blue",18)
    car.carryPeople(4)
    car.identity()
    car.calculateParkingFees(4)

    val bus = Bus("Embassava","ISUZU", "Blue", 35)
    bus.maxTripFare(20.0)
    bus.identity()
    println(bus.calculateParkingFees(5))


}
class Banker ( name: String,  age:Int): Person(name, age){

    fun countMoney(notes:Array<Int>): Int {
        var sum = 0
        notes.forEach{ note->
            sum+=note
        }
        return sum
    }
}


class Doctor( name: String,  age:Int): Person(name, age){

    fun treatPatient(patient:String, illness:String){
    println("Treating $patient for $illness")
    }
}

//farmer inherits from the citizen who inherits from the people: people is the parent, citizen is a child
//therefore attributes can be inherited from children

class Farmer ( name: String,  age:Int): Citizen(name, age) {

    fun cultivateanLd(){
    println("dig dig dig")
    }

    override fun eat(){
        super.eat()
        println("I am enjoying the fruits of my labour")

    }
}

open class Person(var name:String, var age:Int){
    fun talk(words: String) {
        println(words)
    }
//if u want to override a  certain function u first open the function
    open fun eat() {
        println("yum")
    }

    fun sleep() {
        println("zzzzzz")
    }
}

open class Citizen(name: String,age: Int):Person(name, age){
    fun vote(){

    }
    fun payTaxes(){

    }

    fun protest(){

    }
}


open class Car(var make: String,var model:String, var color:String, var capacity:Int){

    open fun carryPeople(people:Int){
        if ( people<= capacity) {
            println("Carrying $people passengers")
        } else {
            var x = people-capacity
            println("Over capacity by $x people")
        }
    }

    fun identity(){
        println("I am a $color, $make, $model")

    }

    open fun calculateParkingFees(hours: Int):Int{
        return hours*20
    }
}

class Bus( make: String, model:String,  color:String,  capacity:Int): Car(make, model, color, capacity){

    fun maxTripFare(fare :Double) :Double{
        println(capacity*fare)
        return  fare * capacity
    }

    override fun calculateParkingFees(hours:Int): Int{
        super.calculateParkingFees(

            return hours*capacity
        )
    }
    }

























