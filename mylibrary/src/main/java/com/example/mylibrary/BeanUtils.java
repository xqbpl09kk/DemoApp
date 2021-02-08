package com.example.mylibrary;

import android.util.Log;

public class BeanUtils {

    public static void fun(){
        Bean bean = new Bean() ;
        bean.doSomething();
        bean.name = "Hao";

        Bean bean1 = new Bean() ;
        Log.e("fun" , bean1.name) ;

        Demo.do1();
    }
}
