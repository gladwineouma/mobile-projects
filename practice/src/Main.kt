fun main() {

val numbers = sortArray(arrayOf(1,2,3,4,5))     //finding max
    println(numbers)
}
fun sortArray (numbers: Array<Int>): Int{
    return numbers.max()
}

