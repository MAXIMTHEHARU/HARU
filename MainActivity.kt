package com.android.mycalculator

fun main() {
    var num1 = readLine()!!.toDouble()
    var operation = readLine()!!.toString()
    var num2 = readLine()!!.toDouble()

    var cal = Calculator()

    var result = {num1().operation().num2()}

    println("${num1}${operation}${num2}의 값은 ${result}")




}

class Calculator {
    fun Operate(num1: Double, oper: String, num2: Double): String {

        var sub = SubstractOperation()
        var add = AddOperation()
        var mul = MultiplyOperation()
        var div = DivideOperation()
        var result: String

    }
}

class AddOperation {
    fun operate(num1:Double, num2:Double): String {

        var result: String
        result = (num1 + num2).toString()
        return result
    }
}

class SubstractOperation {
    fun operate(num1:Double, num2:Double): String {

        var result: String
        result = (num1-num2).toString()
        return result
    }
}

class MultiplyOperation {
    fun operate(num1: Double, num2: Double): String {

        var result: String
        result = (num1 * num2).toString()
        return result
    }
}

class DivideOperation {
    fun operate(num1: Double, num2: Double): String {

        var result: String
        result = (num1 / num2).toString()
        return result
    }
}