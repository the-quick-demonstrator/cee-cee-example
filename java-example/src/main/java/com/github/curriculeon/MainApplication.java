package com.github.curriculeon;

import java.util.Date;

public class MainApplication {
    public static int multiply(Number n, Number y) {
        return n * y;
    }


    public static void main(String[] args) {
        final Date firstProduct = multiply(new Date(),5);
        final int secondProduct = multiply(11,6);
        final int thirdProduct = multiply("hello", new Date());


        System.out.println(firstProduct);
        System.out.println(secondProduct);
        System.out.println(thirdProduct);
    }

}