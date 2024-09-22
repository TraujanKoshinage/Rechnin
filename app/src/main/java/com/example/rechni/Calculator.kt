package com.example.rechni

class Calculator {
    fun calculator(n1: Int, n2: Int, op: String): Int {
        var er: Int
        er = -1
        if (op == "+") {
            er = n1 + n2
        }
        if (op == "-"){
            er = n1 - n2
        }
        if (op == "*"){
            er = n1 * n2
        }
        if (op == "/"){
            er = n1 / n2
        }
        return er
        }
}