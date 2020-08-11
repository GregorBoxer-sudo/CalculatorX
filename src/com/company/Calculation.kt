package com.company

class Calculation {

    fun testVar() {
    }

    fun Sum(y: Float, x: Float, type: String): Float {
        when (type) {
            "a" -> {
                println("Addition");
                println(y+x);
                return y+x;
            }
            "s" -> {
                println("Substract");
                println(y-x)
                return y-x;
            }
            "m" -> {
                println("Multiply");
                println(y*x)
                return y*x;
            }
            "d" -> {
                println("Divide");
                println(y/x)
                return y/x;
            }
            else -> {
                print("Error")
            }
        }
        return (-1).toFloat();
    }
}