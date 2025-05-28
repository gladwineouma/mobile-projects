fun main() {
    println("Hello World!")
    cartegorizeByAge(20)
    cartegorizeByAge(10)
    categorizeByAges(30)
    categorizeByAges(50)
    categorizeByAges(0)
    greet("Kenya")
    greet("Malawi")
    greet("South Africa")
    greet("Japan")
    selectContainers(5)
    selectContainers(8)
    val country = " Tanzania"
     for (ch in country){
         println(ch)
     }
    println(printSquares())
    println(printSquares2())
    println(printSquares3())
    println(article("table"))
    println(article("Apple"))
    println(countryStapleFood("Tanzania"))
    println(countryStapleFood("France"))





}

fun cartegorizeByAge(age: Int){
    if (age <18){
        println("You are a minor")
    }else{
        println("You are a grown up")
    }
}

fun categorizeByAges(age: Int){
    if(age < 1){
        println("Baby")
    }else if(age in 1.. 3){
        println("Toddler")
    }else if(age in 4..12){
        println("Child")
    }else if(age in 13..17){
        println("Teenager")
    }else if (age in 18..35) {
        println("Youth")
    }else{
        println("Old")
    }
}
//write a function that adds the correct article to a string
//for example when given "egg" it should print out "an egg" and when given a
//table it should print out "a table"

fun article(word: String){
    val vowels = "aeiouAEIOU"
    if (word[0] in vowels){
        println("an $word")
    }else{
        println("a $word")
    }
}

fun greet(country: String){
    when(country){
        "Kenya" -> println("Habari ya asubuhi?")
        "Uganda"-> println("Wasuze otya?")
        "Ethiopia"-> println("Dena aderachu?")
        "Malawi"-> println("Mwadzuka bwanji?")
        "South Sudan"->println("Sabalkher")
        "South Afrika"->println("Uvuke kanjani?")
        "Somali"-> println("Subax wangsn?")
        else->println("Good morning?")
    }
}

fun selectContainers(litres: Int): String{
    return when(litres){
        1,2,3 ->  "Bottle"
        4,5,6 -> "Bucket"
        7,8 -> "Big bucket"
        else -> "Big jerrican"
    }
}

//fun retutnLast(counry: String):Char{
//    for (ch in counry){
//        println(ch)
//        if (ch=="a"){
//            return ch
//        }
//    }return ''
//}

//A balanced string is one in which there is an equal
//number of constants and vowels e.g banana. Write a function that
//returns true if a string is balanced


fun balancedString(){

}
//while loop evaluates a condition first before excecution
fun printSquares(){
    var num = 1
    while (num <= 100){
        println(num*num)
        num++
    }
}
//using range 1..100 to print out the range
fun printSquares2(){
    for (num in 1..100)
        println(num*num)
}

//Do-while
fun printSquares3(){
    var num = 1
    do{
        println(num *num)
        num++

    }  while(num <=100)
}

fun countryStapleFood(counry:String){
    if(counry == "Kenya"){
        println("Ugali")
    }else if(counry == "Uganda"){
        println("Matoke")
    }else if(counry == "Ethiopia"){
        println("Anjera")
    }else if(counry== "Malawi"){
        println("Nsima")
    }else if(counry == "Somali"){
        println("Anjera")
    }else{
        println("Rice")
    }

}









