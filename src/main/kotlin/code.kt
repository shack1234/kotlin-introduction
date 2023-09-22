import kotlin.system.exitProcess

// LAB assignment: Introduction to kotlin
fun main() {
//  TASK TWO: writing sample code
    println("What is your Name?")

    val name = readln()
    println("Hello, $name")

//    Task three: Run above

//    Task four:  A simple program to get user input and display it on console
    println("Enter a number: ")

    val stringInput = readLine()!!   //reading line from standard input

    var integer = stringInput.toInt()

    println("You entered: $integer")  // output the results

//    Task Five: Store and add two integer numbers in kotlin

    println("Enter to number to get their sum")
    val first = readLine()!!
    val second = readLine()!!

    val firstToInt = first.toInt()
    val secondToInt = second.toInt()
    val sum = firstToInt + secondToInt

    println("The sum of $first and  $second is: $sum")

//    Task six : Use of else if; check whether an alphabet is vowel or consonant
    println("Enter a letter to tell if it's a vowel or not: ")
    val ch = readLine()
    if (ch =="a" || ch=="e" || ch=="i"|| ch=="o" || ch=="u"){
        println("$ch is a Vowel")
    }else{
        println("$ch is Consonant")
    }

//    Task seven: Using when condition in kotlin
    println("Enter a letter  below: ")
    val letter = readLine()
    when(letter){
        "a","e","i","o","u" -> println("$letter is a vowel") else -> println("$letter is a consonant")
    }

//    Task eight: check if a year is leap or not
    println("Enter a year you were born to check if it's a leap year: ")
    val year = readLine()!!
    val yearCheck = year.toInt()
    var leap = false
    if (yearCheck %4 ==0){
        if (yearCheck %100 ==0){
            leap = yearCheck % 400 ==0
        }else{
            leap = true
        }
        println("Hi $name You were born in $year , which was a leap.")
    }else{
        leap= false
        println("Hi $name You were born in $year , which was not s not a leap.")

    }






















}
