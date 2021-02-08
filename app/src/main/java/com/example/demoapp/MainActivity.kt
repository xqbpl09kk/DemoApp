package com.example.demoapp

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.mylibrary.Bean
import com.example.mylibrary.BeanUtils

class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bean = Bean();
        BeanUtils.`fun`()

        val map = hashMapOf<String, String>().apply {
            put("zhangsan", "hao")
        }

        val result = map["zhangsan"] ?: "buhao".also { map["lisi"] = it }

        Log.e(TAG, "result is $result")
        Log.e(TAG, "map is $map")

        val mediaClip = MediaClip()

        if (mediaClip.hasEffect) {
            Log.i("aa", mediaClip.cacheImagePath + "")
        }
        Log.e(TAG , "Google : ${getGoogle()}")
	val rangeTest = KtRange() 
	rangeTest.range1() 
	rangTest
    }

    private val arrayWrapper = ArrayWrapper()
    init{

        arrayWrapper.array.add(ListItem().apply {
            value.add("Google1")
            value.add("Apple1")
            value.add("Amazon1")
        })
        arrayWrapper.array.add(ListItem().apply {
            value.add("Google2")
            value.add("Apple2")
            value.add("Amazon2")
        })
        arrayWrapper.array.add(ListItem().apply {
//            value.add("Google3")
//            value.add("Apple3")
//            value.add("Amazon3")
        })
    }

   private fun getGoogle(): ArrayList<String> {
        return arrayListOf<String>().apply{
            arrayWrapper.array.filter {
                it.value.isNotEmpty()
            }.map { listItem ->
                this.addAll(listItem.value)
//                this.addAll(listItem.value.filter {
//                    it.contains("Google")
//                })
            }
        }
    }


    private class ArrayWrapper {
        var array :ArrayList<ListItem> = arrayListOf()
    }


    private class ListItem{
        var value : ArrayList<String> = arrayListOf()
    }

}
