package ru.hyrogano;

import kz.hyrogano.test.annotations.MyTest;
import kz.hyrogano.test.annotations.TestableClass;

@TestableClass
public class MySecondTest {
    @MyTest
    public void mySuperTest(){
        System.out.println("my super second test");
    }
}
