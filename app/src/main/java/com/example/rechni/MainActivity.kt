package com.example.rechni

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.rechni.ui.theme.RechniTheme
import kotlin.random.Random

class MainActivity : ComponentActivity()


//Declaration of Maximum and Minimum Values for the random Nummbers
var min1 = 0
var max1 = 1000
var min2 = 0
var max2 = 1000

//Declaration of operation (can be : + - * /)
var op = "error"

//Declaration of final nummbers
var n1 = 1
var n2 = 2

//Random Nummber Generator
fun getNumbers(min1r: Int, max1r: Int, min2r: Int, max2r :Int){
    n1 = Random.nextInt(from = min1r, until = max1r)
    n2 = Random.nextInt(from = min2r, until = max2r)
}

// Calculator
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


