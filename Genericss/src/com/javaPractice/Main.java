package com.javaPractice;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Integer> items = new ArrayList<>();
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);

        printDoubled(items);

    }
    private static void printDoubled(ArrayList<Integer>  n){
        for (Integer i : n){
            System.out.println(i*3);
        }
    }
}
