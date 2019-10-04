package com.company;

import java.io.*;
import java.math.BigInteger;
import java.util.Scanner;

import static java.lang.Math.ceil;
import static java.lang.Math.pow;

public class MyClass3 {

    //insert number and count sum from 1 till inserted
    void function1(){
        System.out.println("insert number >1");
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

    //find value of function y=x if x>2; y=-x if x<=2
    //on line segment [a,b] with step h
    void function2(int a, int b, double h){
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

    //find sum of first 100 squared numbers
    void function3(){
        int res = 0;
        for (int i = 1; i < 101; i++) {
            res += i*i;
        }
        System.out.println("sum = " + res);
    }

    //find multiplication of first 200 squared numbers
    void function4(){
        BigInteger res = BigInteger.valueOf(1);
        for (int i = 1; i < 201; i++) {
            res = res.multiply(BigInteger.valueOf(i));
        }
        System.out.println("multi = " + res);
    }

    //there is number series a_i=1/2^i + 1/3^i;
    //find sum of numbers from series which bigger than 'e'
    void function5(double e){
        double sum = 0;
        double elem = mathFormula(0);
        for (int i = 1; Double.compare(elem, e) >= 0; i++) {
            sum += elem;
            elem = mathFormula(i);
        }
        System.out.println("sum = " + sum);
    }

    //element from series a_i=1/2^i + 1/3^i
    private double mathFormula(int n){
        return 1 / (pow(2, n)) + 1 / (pow(3, n));
    }

    //show symbols and their codes
    void function6(){
        for (int i = 32; i < 127; i++) {
            System.out.println(((char) i) + " " + i);
        }
    }

    //find all dividers for all integer numbers in segment [n,m]
    //'n' and 'm' are inserted, don't show divider =1 and =number
    void function7(){
        double m = Double.parseDouble(getInputNumber());
        double n = Double.parseDouble(getInputNumber());
        int k = (int) ceil(m);
        int end = (int) ceil(n);
        while (k <= end){
            findDividers(k);
            k++;
        }
    }

    //reading input
    private String getInputNumber(){
        System.out.println("input number: ");
        Scanner scanner = new Scanner(System.in);
        String res = scanner.nextLine();
//        scanner.close();
        return res;
    }

    //find and print dividers
    private void findDividers(int number){
        System.out.print("divider for " + number + " is: ");
        for (int i = 2; i < number; i++) {
            if(number%i == 0){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    //there are two numbers, print digits both numbers contain
    void function8(int a, int b){
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
