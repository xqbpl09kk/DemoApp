package com.example.demoapp

import junit.runner.Version
import org.junit.Test


class KtRange{

    @Test
    fun range1(){
        for(i in 1..4){
            print(i)
        }

    }

    @Test
    fun range2(){
        for(i in 4 downTo 1){
            print("i = $i \n")
        }
    }

    @Test
    fun range3(){
        for(i in 2..12 step 3){
            print("i = $i \n")
        }
    }

    @Test
    fun range4(){
        for(i in 1 until 12 step 5){
            print("i = $i \n")
        }
    }



}