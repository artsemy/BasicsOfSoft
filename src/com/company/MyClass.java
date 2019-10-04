package com.company;

import java.time.LocalTime;

import static java.lang.Math.*;

class MyClass {

    //count: ((a-3)*b/2)+c
    void function1(int a, int b, int c){
        double z = ((a - 3) * b / 2. ) + c;
        System.out.println("result: " + z);
    }

    //count: (b+sqrt(b^2-4*a*c))/(2*a)-a^3*c+b^(-2)
    void function2(double a, double b, double c){
        double res = (b + pow(b*b + 4*a*c, 0.5))/(2*a) - pow(a, 3)*c + pow(b, -2);
        System.out.println("result: " + res);
    }

    //count: (sin(x)+cos(y))/(cos(x)-sin(y))*tg(x*y)
    void function3(double x, double y){
        double res = (sin(x) + cos(y)) / (cos(x) - sin(y)) * tan(x*y);
        System.out.println("result: " + res);
    }

    //replace fractional and integer part of number form of 'nnn.ddd' (to 'ddd.nnn')
    void function4(double d){
        int i = (int) (d*1000);
        int fractionalPart = i % 1000;
        int integerPart =  i / 1000;
        double res = fractionalPart + integerPart / 1000.;
        System.out.println("result: " + res);
    }

    //transform seconds to hours minutes and seconds and
    //print in form 'HHч MMмин SSс'
    void function5(long T){
//        LocalTime time = LocalTime.ofSecondOfDay(T);
//        System.out.format("%tHч %tMмин %tSс%n", time, time, time);
        int hour = (int) (T/3600);
        T = T - hour*3600;
        int min = (int) T/60;
        int sec = (int) T - min*60;
        System.out.printf("%02dч %02dмин %02dс", hour, min, sec);
    }

    //display 'true' if point belongs to area, otherwise 'false'
    //area: y[-3,0]x[-4,4] and y[0,4]x[-2,2]
    void function6(double x, double y){
        if(y <= 0 && y >= -3 && x >= -4 && x <= 4){
            System.out.println("true");
        }else if(y >= 0 && y <= 4 && x >= -2 && x <= 2){
            System.out.println("true");
        } else{
            System.out.println("false");
        }
    }

}
