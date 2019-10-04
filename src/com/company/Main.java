package com.company;

public class Main {

    public static void main(String[] args) {
        //linear program
//        func1();
        //branching
//        func2();
        //cycles
//        func3();
        
//        try {
//            System.in.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }

    static void func1(){
        MyClass myClass = new MyClass();
        //count: ((a-3)*b/2)+c
        myClass.function1(4, 3, 1);
        //count: (b+sqrt(b^2-4*a*c))/(2*a)-a^3*c+b^(-2)
        myClass.function2(1., 1., 1.);
        //count: (sin(x)+cos(y))/(cos(x)-sin(y))*tg(x*y)
        myClass.function3(3.,3.);
        //replace fractional and integer part of number form of 'nnn.ddd' (to 'ddd.nnn')
        myClass.function4(222.333);
        //transform seconds to hours minutes and seconds and
        //print in form 'HHч MMмин SSс'
        myClass.function5(10983);
        //display 'true' if point belongs to area, otherwise 'false'
        //area: y[-3,0]x[-4,4] and y[0,4]x[-2,2]
        myClass.function6(2, 3);
    }

    static void func2(){
        MyClass2 myClass2 = new MyClass2();
        //there are two angles, find out if could be triangle with this angles
        //find out if triangle is right-angled
        myClass2.function1(30, 90);
        //find max{ min{a,b}, min{c,d}}
        myClass2.function2(1,2,3,4);
        //there are three points, find out if points belong to one line
        myClass2.function3(1,1,3,3,2,2);
        //there is rectangular hole size A*B, find if a brick
        //size x*y*z can pass through the hole
        myClass2.function4(6, 3, 2, 2, 4);
        //find value: if x<=3 -> x^2-3*x+9 else if x>3 1/(x^3+6)
        myClass2.function5(4);
    }

    static void func3(){
        MyClass3 myClass3 = new MyClass3();
        //insert number and count sum from 1 till inserted
        myClass3.function1();
        //find value of function y=x if x>2; y=-x if x<=2
        //on line segment [a,b] with step h
        myClass3.function2(-5, 5, 1.);
        //find sum of first 100 squared numbers
        myClass3.function3();
        //find multiplication of first 200 squared numbers
        myClass3.function4();
        //there is number series a_i=1/2^i + 1/3^i;
        //find sum of numbers from series which bigger than 'e'
        myClass3.function5(0.000000000001);
        //show symbols and their codes
        myClass3.function6();
        //find all dividers for all integer numbers in segment [n,m]
        //'n' and 'm' are inserted, don't show divider =1 and =number
        myClass3.function7();
        //there are two numbers, print digits both numbers contain
        myClass3.function8(1329, 1123345678);
    }
}
