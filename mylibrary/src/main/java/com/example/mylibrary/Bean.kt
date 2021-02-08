package com.example.mylibrary

open class Bean{
    @JvmField
    internal var name : String ?= "default"
    internal var age : Int =0

    var height : Int = 1

    protected var width = 2



    @JvmName("doSomething")
    internal fun doSomething1(){

    }
}


object Demo{

    @JvmStatic
    fun do1(){

    }
}
internal class BeanWrapper : Bean(){
}

