package com.example.demoapp

import android.util.Log
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

private const val TAG = "KtCoroutine"

fun routine1(){
    Log.i(TAG ,  " routine1  , main thread is ${Thread.currentThread().id}")
    GlobalScope.launch {
        delay(2000)
        Log.e(TAG ,  " routine1  , current thread is ${Thread.currentThread().id}")
    }

}

fun routine2(){
    val job = GlobalScope.launch {
        delay(1000L )
        Log.e(TAG , "routine2 , launch ")
    }
    Log.e(TAG , "routine2 , launch2 ")
    suspend {
        job.join()
    }
    Log.e(TAG , "routine2 , launch3 ")

}
