package com.demo;

public class EnumDemo {

    public static void main(String args[]) {
        EnumDemoDeclare enumDemo = new EnumDemoDeclare();
        enumDemo.size = EnumDemoDeclare.EnumDemoDeclareSize.MEDIUM ;
        System.out.println("Size: " + enumDemo.size);
    }
}
