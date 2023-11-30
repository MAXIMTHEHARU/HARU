package com.android.mycalculator

fun main() {

    var number1 = readln().toDouble()
    var operate = '+'
    var number2 = readln().toDouble()

    operate = '-'


    if (operate == '+') {
        println("${number1 + number2}")
    } else if (operate == '-') {
        println("${number1 - number2}")
    } else if (operate == '*') {
        println("${number1 * number2}")
    } else if (operate == '/') {
        println("${number1 / number2}")
    } else {
        println("잘못된 연산자 입니다.")
    }
}
