package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println(factorial(10))
    println("-------------Loop-------------")
    helloLoop(50)
    println("----------Recursion-----------")
    helloRecursive(50)
}

fun countdown(integer: Int) {
    println(integer)
    if (integer > 1) {
        countdown(integer - 1)
    }


    countdown(20)
    println(factorial(10))
}

fun factorial(n: Long): Long {
    require(n >= 0) {
        "Can not be negative"
    }
    if (n == 1.toLong() || n == 0.toLong()) return 1
    return n * factorial(n - 1.toLong())
}

fun helloLoop(n: Int) {
    for (k in 0 until n) {
        println("Hello World")
    }
}

fun helloRecursive(n: Int) {
    if (n > 0) {
        println("Hello World")
        helloRecursive(n - 1)
    }
}

fun staircasePossibilities(n: Int): Int {
    if (n == 1 || n == 0) return 1
    return staircasePossibilities(n - 1)+staircasePossibilities(n - 2)
}