package ru.hyrogano;

import kz.hyrogano.Testable;
import kz.hyrogano.test.annotations.MyTest;
import kz.hyrogano.test.annotations.TestableClass;

//@TestableClass
@MyTest
public class MyFirstTest {
//    @MyTest
    public int someField;

    @MyTest(2)
    public void secondTest(){
        System.out.println("second test");
    }

    @MyTest(1)
    public void firstTest(){ System.out.println("first test"); }
}


