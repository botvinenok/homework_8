package com.hillel.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        RealizeArrayList<Integer> arr = new RealizeArrayList<Integer>();
        System.out.println("Size is : " + arr.size());
        arr.add(1);
        arr.add(2);
        System.out.println("Size is : " + arr.size());
        for (int i = 0; i < 50; i++){ arr.add(i); }
        System.out.println("Size is : " + arr.size());
        System.out.println("Element " + arr.get(2));
        System.out.println("Element " + arr.get(3));
        arr.add(55,3);
        System.out.println("Element " + arr.get(3));
        System.out.println("Size is : " + arr.size());


    }

}
