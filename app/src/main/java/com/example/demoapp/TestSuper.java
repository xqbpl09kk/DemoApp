package com.example.demoapp;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestSuper {

    List<? super NewBean> list = new ArrayList<>();
    List<? extends NewBean> list2 = new ArrayList<>();

    //理解 ： 这并非两个相反的概念
    // ， super 表示list可以接收继承自NewBean的对象
    // ， extends表示list2是已经是确定的类型， 只能有一种类型（Java类的单继承性）

    @Test
    public void test() {
        Bean bean = new Bean();
        NewBean newBean = new NewBean();
        OldBean oldBean = new OldBean();
//        list.add(bean);
        list.add(newBean);
        list.add(oldBean);
        Object newBean1 =  list.get(9) ;

//        list2.add(bean);
//        list2.add(newBean);
//        list2.add(oldBean) ;

        Collections.copy(list , list2 );

    }
}

class Bean { }

class NewBean extends Bean { }

class OldBean extends NewBean { }


