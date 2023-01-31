package com.demo;

public class Arithmatic {
    static int sum;
    static final double pi = 3.141;
    public int add(int a, int b){
        sum = a+b;
        return sum;
    }
    public int sub(int a, int b){
        sum = a-b;
        return sum;
    }
    public int mul(int a, int b){
        return a*b;
    }
    public int div(int a, int b){
        return a/b;
    }

    public static void main(String[] args) {
        Arithmatic art = new Arithmatic();
        sum = 10;
        System.out.println("Accessing instance variable sum "+sum);
        System.out.println("Addtion of 5,10 is "+art.add(5,10));
        System.out.println("Subtracting of 10 from 30 is "+art.sub(30,10));
        System.out.println("Product of 5,10 is "+art.mul(5,10));
        System.out.println("Dividing of 10 by 5 is "+art.div(10,5));
    }
}
