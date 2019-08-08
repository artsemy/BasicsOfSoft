package com.company;

import java.io.*;
import java.time.LocalTime;
import java.util.Scanner;

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
        double x = (double) (x3 - x1) / (x2 - x1);
        double y = (double) (y3 - y1) / (y2 - y1);
        if(x == y){
            System.out.println("on line");
        } else {
            System.out.println("not on line");
        }
    }

    void function10(int x, int y, int z){
        int A = 2;
        int B = 4;
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

    private boolean checkCondition(int i1, int i2, int j1, int j2){
        double d1 = (double) max(i1, i2) / min(i1, i2);
        double d2 = (double) max(j1, j2) / min(j1, j2);
        int area1 = i1 * i2;
        int area2 = j1 * j2;
        return (area1 >= area2) && (d1 >= d2);
    }

    void function11(double x){
        double res;
        if(x <= 3){
            res = x * x - 3 * x + 9;
        } else {
            res = 1 / (pow(x, 3) + 6);
        }
        System.out.println("f= " + res);
    }

    void function12(){
        System.out.println("insert number");
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        int n = 1;
        try {
            n = Integer.parseInt(bufferedReader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        int res1 = (1 + n) * n / 2;
        int res2 = 0;
        for (int i = 1; i <= n; i++) {
            res2 += i;
        }
        System.out.println(res1 + " = " + res2);
//        try {
//            inputStream.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }

    void function13(int a, int b, double h){
        double current = a;
        while (current <= b){
            if(current > 2){
                System.out.print(current + " ");
            } else {
                System.out.print((-current) + " ");
            }
            current += h;
        }
    }

    void function14(){
        int res = 0;
        for (int i = 1; i < 101; i++) {
            res += i*i;
        }
        System.out.println("sum = " + res);
    }

    void function15(){
        int res = 1;
        for (int i = 1; i < 201; i++) {
            res *= pow(i, 2);
        }
        System.out.println("multi = " + res);
    }

    void function16(double e){
        double sum = 0;
        double elem = mathFormula(0);
        for (int i = 1; Double.compare(elem, e) >= 0; i++) {
            sum += elem;
            elem = mathFormula(i);
        }
        System.out.println("sum = " + sum);
    }

    private double mathFormula(int n){
        return 1 / (pow(2, n)) + 1 / (pow(3, n));
    }

    void function17(){
        for (int i = 32; i < 127; i++) {
            System.out.println(((char) i) + " " + i);
        }
    }

    void function18(){
        double m = Double.parseDouble(getInputNumber());
        double n = Double.parseDouble(getInputNumber());
        int k = (int) ceil(m);
        int end = (int) ceil(n);
        while (k <= end){
            findDividers(k);
            k++;
        }
    }

    private String getInputNumber(){
        System.out.println("input number: ");
        Scanner scanner = new Scanner(System.in);
        String res = scanner.nextLine();
//        scanner.close();
        return res;
    }

    private void findDividers(int number){
        System.out.print("divider for " + number + " is: ");
        for (int i = 2; i < number; i++) {
            if(number%i == 0){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    void function19(int a, int b){
        String str1 = String.valueOf(a);
        String str2 = String.valueOf(b);
        for (int i = 0; i < 10; i++) {
            boolean b1 = str1.contains(String.valueOf(i));
            boolean b2 = str2.contains(String.valueOf(i));
            if(b1 && b2){
                System.out.print(i + " ");
            }
        }
    }

}
