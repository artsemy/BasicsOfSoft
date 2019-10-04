package com.company;

import static java.lang.Math.*;

public class MyClass2 {

    //there are two angles, find out if could be triangle with this angles
    //find out if triangle is right-angled
    void function1(int angle1, int angle2){
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

    //find max{ min{a,b}, min{c,d}}
    void function2(int a, int b, int c, int d){
        System.out.println(max(min(a, b), min(c, d)));
    }

    //there are three points, find out if points belong to one line
    void function3(int x1, int y1, int x2, int y2, int x3, int y3){
        double x = (double) (x3 - x1) / (x2 - x1);
        double y = (double) (y3 - y1) / (y2 - y1);
        if(x == y){
            System.out.println("on line");
        } else {
            System.out.println("not on line");
        }
    }

    //there is rectangular hole size A*B, find if a brick
    //size x*y*z can pass through the hole
    void function4(int x, int y, int z, int A, int B){
        if(checkCondition(A, B, x, y)){
            System.out.println("yes, it can");
        } else if(checkCondition(A, B, x, z)){
            System.out.println("yes, it can");
        } else if(checkCondition(A, B, y, z)){
            System.out.println("yes, it can");
        } else {
            System.out.println("no, it can't");
        }
    }

    //check one plane of the brick
    private boolean checkCondition(int i1, int i2, int j1, int j2){
        double d1 = (double) max(i1, i2) / min(i1, i2);
        double d2 = (double) max(j1, j2) / min(j1, j2);
        int area1 = i1 * i2;
        int area2 = j1 * j2;
        return (area1 >= area2) && (d1 >= d2);
    }

    //find value: if x<=3 -> x^2-3*x+9 else if x>3 1/(x^3+6)
    void function5(double x){
        double res;
        if(x <= 3){
            res = x * x - 3 * x + 9;
        } else {
            res = 1 / (pow(x, 3) + 6);
        }
        System.out.println("f= " + res);
    }

}
