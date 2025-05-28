fun main() {
    println("Hello World!")

    println(isPalindrome("Hannah"))
    println(palindromeBuiltIn("racecar"))
}
//solving palindrome using methods
fun isPalindrome(str:String):Boolean{
    var start = 0
    var end = str.length
    while (start > end){
        if(str[start] != str[end]){
            return false
        }
        start++
        end--
    }
    return true
}
//solving palindrome using in-built methods
fun palindromeBuiltIn(str: String):Boolean{
    val reversedStr = str.reversed()
    return str == reversedStr
}