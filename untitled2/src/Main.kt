import java.util.*

fun main() {
    val name = "AkiraChix"
    println(name.length)
    println(name[2])
    println(name[3])

    val doctor = Doctor("Dr. John ", "MD-1234", "Cardiology", 2010, 0)

    doctor.introduction()
    doctor.treatPatient("Jane Smith", "Flu")
    doctor.treatPatient("Mike Johnson", "High Blood Pressure")
    doctor.ranking()
}



fun string(s:String){
    println(s.length)
}


    class Doctor(
         val name: String,
         val registrationNumber: String,
         val specialization: String,
         val yearOfGraduation: Int,
         var numberOfPatientsTreated: Int
    ) {

        fun introduction() {
            println("Name: $name")
            println("Registration Number: $registrationNumber")
            println("Specialization: $specialization")
            println("Year of Graduation: $yearOfGraduation")
            println("Number of Patients Treated: $numberOfPatientsTreated")
        }

        fun treatPatient(patient: String, illness: String) {
            println("Treating patient: $patient for illness: $illness")
            numberOfPatientsTreated++
            println("Number of patients treated: $numberOfPatientsTreated")
        }

        fun ranking() {
            val currentYear = Calendar.getInstance().get(Calendar.YEAR)
            val experienceYears = currentYear - yearOfGraduation
            println("Years of experience: $experienceYears")
        }
    }



//Create a class called Human with these attributes: name, age, weight. It has the following functions:
//eat(foodWeight: Int) :Prints “I am eating {foodWeight} kgs of food” and increments the human’s weight by the weight of the food eaten
//speak(speech: String) :Prints the string passed to it
//birthday( ) :Increments the human’s age by 1
//  Create an instance of this human class and invoke all its functions

class Human (
        val name: String,
        val age: Int,
        val weight: Double,
        )

fun eat(foodWeight: Int){
    println("I am eating $foodWeight ")

}

fun birthday(){
    println()
}






























