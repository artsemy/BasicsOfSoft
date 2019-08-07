package com.company;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import static java.lang.Math.*;

public class MyClass {

    public void function1(int a, int b, int c){
        double z = ((a - 3) * b / 2 ) + c;
        System.out.println("result: " + z);
    }

    public void function2(int a, int b, int c){
        double res = (b + pow(b*b + 4*a*c, 0.5))/(2*a) - pow(a, 3)*c + pow(b, -2);
        System.out.println("result: " + res);
    }

    public void function3(int x, int y){
        double res = (sin(x) + cos(y)) / (cos(x) - sin(y)) * tan(x*y);
        System.out.println("result: " + res);
    }

    public void function4(double d){
        int i = (int) (d*1000);
        int fractionalPart = i % 1000;
        int integerPart =  i / 1000;
        double res = integerPart + fractionalPart / 1000.;
        System.out.println("result: " + res);
    }

    public void function5(long T){
        LocalTime time = LocalTime.ofSecondOfDay(T);
        System.out.format("%tHч %tMмин %tSс", time, time, time);
    }
}
