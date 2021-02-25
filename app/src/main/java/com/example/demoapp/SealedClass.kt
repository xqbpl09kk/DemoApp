package com.example.demoapp

import org.jetbrains.annotations.TestOnly
import java.net.HttpURLConnection


//创建一个有限定类型的基类，方便遍历使用。
sealed class Expr

data class Const(val const : Double ) : Expr()
data class Sum(val e1 : Expr , val e2 : Expr  ) : Expr()

object  NotAnNumber : Expr()

fun eval(expr : Expr) :Double = when(expr){
    is Const -> {
        expr.const
    }
    is Sum -> eval(expr.e1)  + eval(expr.e2)
    NotAnNumber -> Double.NaN
    else  -> Double.NaN
}

@TestOnly
fun test(){
    eval(Const(12.0))
}


sealed class Result<out R> {
    data class Success<out T>(val data: T) : Result<T>()
    data class Error(val exception: Exception) : Result<Nothing>()
}
