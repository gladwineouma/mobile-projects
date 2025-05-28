fun main() {
    println("Hello World!")

    multiply()

    add(65, 72)
    add(982, 767)
    add(384, 252)
    bestFriend("Sandra")
    bestFriend("Pauline")
    bestFriend("Lizz")
    square(4)
    square(5)
    square(6)
    square(7)
    println(isEven(8))
    println(isEven(9))
    println(isEven(6))

}

fun text(t:String) {
    val result = "${t[0]} &{t[2]} &{["
}

fun multiply() {

    greeting()
    val x = 34
    val y = 37
    val product = x * y
    println(product)

}

fun greeting() {
    println("Hello Karen")

}

fun add(a: Int, b: Int) {
    var sum = a + b
    println(sum)
    return

}

fun bestFriend(name: String) {

    println("My best friend is" + name)
    // write a function that prints out the square of any number passed to it
}

fun square(a: Int) {
    var square = a * a

    println(square)
}

//write a function that returns true or false depending on whether the number passed to it is even or
//function name suggestion is even

fun isEven(num: Int): Boolean {
    return num % 2 == 0
}


//fun validpassword (userpassword: String){
//    val upass= userpassword.lowercase()
//    val pw123= "password"
//    val pwd123map = HashMap<Char, Int>()
//    pw123.forEach { x->
//        val xcount= pw123map.getorDefault(x,0)
//        pw123[x] = ++xcount
//    }
//    val uspass = HashMap<Char, Int>()
//    for {
//        val ycount= upassmap.getorDefault[y,0]
//        upassmap[y]= ++ycount
//    }
//}





