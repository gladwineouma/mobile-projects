fun main() {
    println(goodString("abacbc"))
    println(goodString("abbcabcd"))
    println(percent("arbitrary", 'r'))
    val xx = arrayOf('H', 'a', 'n', 'n', 'a', 'h')
    println(reverse(xx).contentToString())
    println(muns(arrayOf(1, 2, 3, 2, 1, 3, 45, 22)))


}

fun goodString(s: String): Boolean {
    if (s.isEmpty()) return true
    val k = s.toCharArray()
    val uniqueChars = k.toSet()
    val frequencySet = mutableSetOf<Int>()
    for (char in uniqueChars) {
        val count = k.count { it == char }
        frequencySet.add(count)
    }
    return frequencySet.size == 1
}

//2
fun percent(word: String, occ: Char): Double {
    val k = word.length.toDouble()
    var b = word.count { it == occ }
    var result = b / k * 100.0
    return result
}//3

fun reverse(name: Array<Char>): Array<Char> {
    var l = 0
    var r = name.size - 1
    while (l < r) {
        val temp = name[l]
        name[l] = name[r]
        name[r] = temp
        l++
        r--
    }
    return name
}


//4
fun muns(n: Array<Int>): Boolean {
    val j = n.toSet()
    println(j)
    if (n.size == j.size) {
        return false
    } else {
        return true
    }
}