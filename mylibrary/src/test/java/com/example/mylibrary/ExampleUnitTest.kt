package com.example.mylibrary

import android.util.Log
import org.junit.Assert.assertEquals
import org.junit.Test

import org.jetbrains.annotations.TestOnly
import kotlin.math.abs
import kotlin.reflect.KProperty
/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }


    @Test
    fun test(){
        val testUnit = TestClass()
        println( " test unit value is ${testUnit.abc}")
        testUnit.abc  = "new Value given  !!!"
    }

    @Test
    fun testMediaDB (){
        val testMediaDB = TestMediaDB()
        testMediaDB.mediaDB2 = MediaDB()
    }

    @Test
    fun testList(){
        val list0 : ArrayList<String >  = arrayListOf()
        val list = arrayListOf<String>().apply {
            add("abc,abc1")
            add("abc,abc2")
            add("abc ,3")
            add("abc,4")
            add("abc")
            add("abc")
            add("abc")
            add("abc")
            add("NBCh")
            add("NBC4")
            add("NBC3")
            add("NBC12")
            add("NBC1")
        }
        val list2 = list.filter {
            it.contains("A")
        }
        val list3 = list.filter {
            it.contains("abc")
        }.map {
            it.toUpperCase()
        }.flatMap {
            it.split(",")
        }.asReversed()

        val e = list.firstOrNull { it.startsWith("M") }
        print("e is $e ")

        print("list2 is $list2")
        print("list3 is $list3")
    }




    fun parentFun() :(parameter : String)  -> String{

        return fun(p :String) :String{
            println("this is fun in fun  $p ")
            return "New"
        }

    }


    fun funParameters(params2 :String , unit : (p :String) -> String  ){
        unit.invoke(params2)
    }


    @Test
    fun testFun(){
        val parentRef = parentFun()
//        parentRef.invoke("Interisting")
        funParameters("new "  , parentRef)
    }


}


class TestMediaDB{
    val mediaDB = MediaDB()
    var mediaDB2 : MediaDB  by MediaDBMonitor()

}

class MediaDB {


}

class MediaDBMonitor{
    operator fun getValue(thisRef: Any?, property: KProperty<*> )  :MediaDB{
        return MediaDB()
    }
    operator  fun setValue(thisRef: Any?, property: KProperty<*>, value: MediaDB){
        println("$value has been assigned to '${property.name}' in $thisRef.")
    }
}


class TestClass{
    val valueProvider = ValueProvider ()
    var abc : String by valueProvider

}

class ValueProvider{
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return "$thisRef, thank you for delegating '${property.name}' to me!"
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        println("$value has been assigned to '${property.name}' in $thisRef.")
    }
}


