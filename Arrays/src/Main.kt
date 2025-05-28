fun main() {
    var friends = arrayOf("Dan", "Ken", "Kip", "Bill", "Jane", "Linn")

//    val sortedFriends = friends.sortedArrayDescending()
//    println(sortedFriends.contentToString())
//
//
//    println(friends[2])
//    println(friends.get(2)) //get can be used in place of []
//    friends[1] = "Hani"
//    println(friends.contentToString()) // replacement
//
//    friends[3] = "Mildred"
//    println(friends.contentToString())
//
//
//    friends.set(3,  "Mildred")
//    println(friends.contentToString())

    val sortedFriends = friends.sortedArrayDescending()
    println(sortedFriends.contentToString())





    //println(friends[6]) is error because it does not exist
//println(friends.contentToString())
   // println(friends[4]) //slicing elements

    //val nums: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    //val Abby: Array<Any> = arrayOf("Abigael", 21, 50.2, true)
    //println(Abby.contentToString())

    println(friends.contentToString())
    friends = friends.plus("Meaza")
    println(friends.contentToString())

    friends = friends.plus(arrayOf("Tom", "Tim","Tony"))    //add more than one element in an array
    println(friends.contentToString())

    println(friends.indexOf("Jane"))    //indexof gives us the particular index of element
    println(friends.indexOf("lwam"))     //used to identify if an element exists lwam gives -ve bcoz it does not exist

    for(friend in friends){              //print element 1 by 1
        println(friend)  }

    friends.forEach { friend-> println(friend) }


val nums = arrayOf(31,56,7,32,17,8,90,34)      //these are inbuilt function
    println(nums.sum())
    println(nums.size)
    println(nums.count())
    println(nums.average())
    println(nums.min())
    println(nums.max())

    val sortedNums = nums.sortedArrayDescending()
    println(sortedNums.contentToString())

    val sortedNums = nums.sortedArrayAscending)

//    var numsSum = 0f
//    nums.forEach { num->numsSum+num.toFloat() }
//    println(numsSum)

//sumOfSquares(1,2 ,3,4)


//write a function that takes an array of integers then returns
//the sum of the square of the elements for example
//[1,2,3,4,]the output should be 30

val numbs = arrayOf(1,2,3,4,5)
    nums.forEach { nums->nums*nums.toInt() }
    println(numbs)
}
//
//fun sumOfSquares (nums: Int, i: Int, i1: Int, i2: Int): Int{
//    var sum = 0
//    for (nums in nums){
//    val Sq = nums*nums
//        sum= Sq}
//    return sum

