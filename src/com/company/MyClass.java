package com.company;

import java.time.LocalTime;
import static java.lang.Math.*;

class MyClass {

    void function1(int a, int b, int c){
        double z = ((a - 3) * b / 2 ) + c;
        System.out.println("result: " + z);
    }

    void function2(int a, int b, int c){
        double res = (b + pow(b*b + 4*a*c, 0.5))/(2*a) - pow(a, 3)*c + pow(b, -2);
        System.out.println("result: " + res);
    }

    void function3(int x, int y){
        double res = (sin(x) + cos(y)) / (cos(x) - sin(y)) * tan(x*y);
        System.out.println("result: " + res);
    }

    void function4(double d){
        int i = (int) (d*1000);
        int fractionalPart = i % 1000;
        int integerPart =  i / 1000;
        double res = fractionalPart + integerPart / 1000.;
        System.out.println("result: " + res);
    }

    void function5(long T){
        LocalTime time = LocalTime.ofSecondOfDay(T);
        System.out.format("%tHч %tMмин %tSс%n", time, time, time);
    }

    void function6(double x, double y){
        if(y <= 0 && y >= -3 && x >= -4 && x <= 4){
            System.out.println("true");
        }else if(y >= 0 && y <= 4 && x >= -2 && x <= 2){
            System.out.println("true");
        } else{
            System.out.println("false");
        }
    }

    void function7(int angle1, int angle2){
        int angle3 = 180 - angle1 - angle2;
        if(angle1 > 0 && angle2 > 0 && angle3 > 0){
            System.out.println("this is triangle");
            if (angle1 == 90 || angle2 == 90 || angle3 == 90){
                System.out.println("this is right-angled triangle");
            } else {
                System.out.println("this is not right-angled triangle");
            }
        } else {
            System.out.println("this is not triangle");
        }
    }

    void function8(int a, int b, int c, int d){
        System.out.println(max(min(a, b), min(c, d)));
    }

    void function9(int x1, int y1, int x2, int y2, int x3, int y3){
        double x = (x3 - x1) / (x2 - x1);
        double y = (y3 - y1) / (y2 - y1);
        if(x == y){
            System.out.println("on line");
        } else {
            System.out.println("not on line");
        }
    }

}
