import jdk.internal.org.jline.utils.Colors.s

fun main() {
    println("Hello World!")

    println(percenChar("arbitrary",'r'))
    println(reverdeStrings(arrayOf('a','p','p','l','e')))
    println(indistictArray(arrayOf(1,2,3,4)))
    println(indistictArray(arrayOf(2,3,4,2,1)))
    println(targetSum(arrayOf(2,3,4),6).contentToString())
    println(taegetSum2(arrayOf(2,3,4),6))

}


fun percenChar (s: String, x: Char):Double{
    var count = 0
    for (ch in s){
        if (ch ==x){
            count++
        }
    }
    return (count.toDouble()/s.length)*100
}

fun reverdeStrings (s:Array<Char>): Array<Char> {
    var l = 0
    var r = s.size - 1
    while (l<r){
        val tmp = s[l]
        s[l]=s[r]
        s[r] = s[l]
        l++
        r--
    }
    return s
}
fun indistictArray(nums: Array<Int>):Boolean{
    return nums.toSet().size != nums.size
}

fun indistictArray1(nums: Array<Int>):Boolean{
    val occurrence = HashMap<Int,Int>()
    for (n in nums){
        var ncount = occurrence.getOrDefault(n, 0)
        occurrence[n]= ++ ncount

    }
    val values = occurrence.values
    for (v in values){
        if (v >= 2) {

            return true
        }
    }
    return false
}
fun targetSum(nums : Array<Int>,target: Int): Array<Int>{
    val res = arrayOf(0,0)
    for (num in nums){
        val diff = target - num
        if(nums.contains(diff)){
            res[0] = nums.indexOf(num)
            res[1] = nums.indexOf(diff)
        }
    }
    return res
}
fun taegetSum2(nums : Array<Int>,target: Int): Array<Int>{
    val seen = HashMap<Int,Int>()
    val res = arrayOf(0,0)
    nums.forEachIndexed { idx, num->
        val diff = target - num
        if(seen.keys.contains(diff)){
            res [0] = seen[diff]!!
            res [1] = idx
            return res
        }
        else{
            seen[num]= idx
        }
    }
    return res
}









//fun main() {
//    println("Hello World!")
//
//    println(goodString(("abacbc")))
//}
//
//fun goodString (s: String): Boolean{
//    val occurrenceMap = HashMap<Char, Int>()
//    for (x in s){
//        var xcount = occurrenceMap.getOrDefault(x, 0)
//        occurrenceMap[x]==xcount
//    }
//    val values = occurrenceMap.values.toList()
//    val first = values[0]
////    for (x in s){
////        if (v!=first){
////            return false
//        }
//    }
//
//    return values.toSet().size==1
//}