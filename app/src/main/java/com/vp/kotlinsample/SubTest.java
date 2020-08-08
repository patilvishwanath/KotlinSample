package com.vp.kotlinsample;

/**
 * Created by Vishwanath Patil on 30/07/20.
 */
class SubTest extends Test {

   // int a = 10;


    void show(){
a = a - 15;
        System.out.println("Here a value "+a);
    }

    public static void main(String[] args) {
        SubTest st = new SubTest();
        st.display();
        System.out.println(st.a);
        st.show();


    }
}
