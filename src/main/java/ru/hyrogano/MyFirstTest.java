package ru.hyrogano;

import kz.hyrogano.Testable;
import kz.hyrogano.test.annotations.TestableClass;

@TestableClass
public class MyFirstTest {
    public void secondTest(){
        System.out.println("second test");
    }
    public void firstTest(){ System.out.println("first test"); }
}
