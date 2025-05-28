fun main() {
    val colors = listOf("red","blue","yellow","green","orange")
    println(colors)

    val fruits = mutableListOf("Banana","Orangr","Mango","Orange","Papaya")
    fruits.add("watermelon")
    fruits.add("Grape")
    fruits.add("Pineapple")
    println(fruits)
    fruits.remove("Mango")
    fruits.removeAt(0)

    val nums = listOf(12,45,6,45,34,456,678,34,21,78,89,76,43)
    println(nums.size)
    println(nums.count())
    println(nums.max())
    println(nums.min())
    println(nums.average())
    println(nums.indexOf(43))
    val st1 = Student("Paline",23,80,"Kenyan")
    val st2 = Student("Mary",21,86,"Rwanda")
    val st3 = Student("Rebecca",12,45,"Ethiopian")
    val  st4 = Student("Esther",23,23,"Ugandan")
    val students = listOf(st1,st2,st3,st4)
    for (student in students){
        println(student)
        println(student.codeHiveNo)
    }
    var sortedStudents = students.sortedBy { student: Student -> student.codeHiveNo }
    println(sortedStudents)

    val num = listOf(21,23,456,56,78)
    val sortedNum = num.sorted()
    println(num.sorted())
    val children = num.filter { num-> num<18 }
    println(children)


}

// write a function that given a list of students with the above
//properties will return a list of students whose age is odd
data class Student(
    val name: String,
    var age: Int,
    var codeHiveNo: Int,
    var nationality: String
)

//Write a function that given a list of students like above returns a list of students that are not from kenya


//fun oddAges(students:List<Students>):MutableListOf<Students>{
//    val  result = mutableListOf<Student>()
//




//a list is a generic ordered collection of a items
//val colors = arrayOf("red","blue","yellow","green","orange")
//println(colors.contentToString())
//list methods=a
//mutable list methods=add,remove
//removeAt() pass the index you want to remove
//


