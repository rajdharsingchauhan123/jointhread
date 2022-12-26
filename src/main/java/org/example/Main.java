package org.example;

public class Main {
    // declare varibale type

    public static void main(String[] args) {
        System.out.println("Hello world!");
        int mean =5;
        int tip =2;
        var total = mean +(mean>6? tip++: tip--);
        System.out.println(total);
    }

}